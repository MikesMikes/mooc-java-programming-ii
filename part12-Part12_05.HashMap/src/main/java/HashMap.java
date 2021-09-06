
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private int getIndexOfKey(K key) {
        int indexOfHashed = Math.abs(key.hashCode() % this.values.length);
        return indexOfHashed;
    }

    public void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];
        for (int i = 0; i < this.values.length; i++) {
            newArray = copy(newArray, i);
        }

        this.values = newArray;
    }

    public ArrayList<Pair<K, V>>[] copy(ArrayList<Pair<K, V>>[] newArray, int fromIndex) {

        if (this.values[fromIndex] == null || this.values[fromIndex].isEmpty()) {
            this.values[fromIndex] = new ArrayList<>();
            return newArray; //nothing else do here
        }

        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> value = this.values[fromIndex].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);

            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }

        return newArray;
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex == null) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    public boolean contains(K key) {
        boolean found = false;
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return false;
        }

        ArrayList<Pair<K, V>> pairs = this.values[hashValue];

        for (int i = 0; i < pairs.size(); i++) {
            if (this.values[hashValue].get(i).getKey().equals(key)) {
                found = true;
            }
        }

        return found;
    }

    public int getHash(String key) {
        return Math.abs(key.hashCode() % this.values.length);
    }

    public boolean readyToGrow() {
        return 1.0 * this.firstFreeIndex / this.values.length > 0.75;
    }

    public void showKeys() {
        System.out.println("Keys: ");
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != null) {
                for (int j = 0; j < this.values[i].size(); j++) {
                    System.out.println("Index " + (j + 1) + " out of " + this.values[i].size() + ", Index: " + i + ", key: " + this.values[i].get(j).getKey() + ", values: " + this.values[i].get(j).getValue());
                }
            }
        }
    }

    public ArrayList<Pair<K, V>> getPairsAtIndex(K key) {

        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        return this.values[hashValue];

    }

    public int getArraySize() {
        return this.values.length;
    }

    public void getPairsAtKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        System.out.println("At hashValue: " + key);
        for (int i = 0; i < this.values[hashValue].size(); i++) {
            System.out.println("Key: " + this.values[hashValue].get(i).getKey() + ", Value: " + this.values[hashValue].get(i).getValue());
        }
    }

}
