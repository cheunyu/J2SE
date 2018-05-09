package compara.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public static void main(String[] args) {
        Person personA = new Person(1,"Snajdan",20);
        Person personB = new Person(2,"allen",25);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(personA);
        personList.add(personB);
        Collections.sort(personList);
        for(int i=0;i<personList.size();i++) {
            System.out.println(personList.get(i).getName());
        }
    }
}
