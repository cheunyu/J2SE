package compara.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

    public static void main(String[] args) {
        Person personA = new Person(1,"Snajdan",25);
        Person personB = new Person(2,"allen",20);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(personA);
        personList.add(personB);
        Collections.sort(personList, new PersonNameComparator());
        for(int i=0;i<personList.size();i++) {
            System.out.println(personList.get(i).getName());
        }
    }
}
