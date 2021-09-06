
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person i : peopleToAdd) {
            employees.add(i);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation().ordinal() == education.ordinal()){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iter = employees.iterator();
        
        while(iter.hasNext()){
            if(iter.next().getEducation().equals(education)){
                iter.remove();
            }
        }
    }
}