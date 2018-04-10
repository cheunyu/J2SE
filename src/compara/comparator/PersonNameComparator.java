package compara.comparator;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //String desc
        return -o1.getName().compareTo(o2.getName());
    }
}
