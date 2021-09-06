
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Implemented HashMap including containsKey() function
 *
 * @author micha
 */
public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        
    }

//    public static void main(String[] args) {
//        ArrayList<String> myList = new ArrayList<>();
//        HashMap<String, String> hashMap = new HashMap<>();
//
//        for (int i = 0; i < 1000000; i++) {
//            myList.add("" + i);
//            hashMap.add("" + i, "" + i);
//        }
//
//        ArrayList<String> elements = new ArrayList<>();
//        Random randomizer = new Random();
//        for (int i = 0; i < 1000; i++) {
//            elements.add("" + randomizer.nextInt(2000000));
//        }
//
//        long listSearchStartTime = System.nanoTime();
//        for (int i = 0; i < elements.size(); i++) {
//            myList.contains(elements.get(i));
//        }
//        long listSearchEndTime = System.nanoTime();
//
//        long hashMapSearchStartTime = System.nanoTime();
//        for (int i = 0; i < elements.size(); i++) {
//            hashMap.contains(String.valueOf(i));
//        }
//        long hashMapSearchEndTime = System.nanoTime();
//
//        long listSearch = listSearchEndTime - listSearchStartTime;
//        System.out.println("List: the search took about " + listSearch / 1000000 + " milliseconds ("
//                + listSearch + " nanoseconds.)");
//
//        long hashMapSearch = hashMapSearchEndTime - hashMapSearchStartTime;
//        System.out.println("Hash map: the search took about " + hashMapSearch / 1000000
//                + " milliseconds (" + hashMapSearch + " nanoseconds.)");
//    }
}
