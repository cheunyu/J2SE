package compara.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getId()-o2.getId();
        if(result == 0) {
            result = o1.getAge()-o2.getAge();
        }
        if(result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
