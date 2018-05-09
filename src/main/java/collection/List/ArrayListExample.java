package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void addElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000000;i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("add time : " + (endTime-startTime));
    }

    public static void removeElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        list.remove(0);
        long endTime = System.currentTimeMillis();
        System.out.println("remove time : " + (endTime-startTime));
    }

    public static void removeElementsMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        list.remove(list.size()/2);
        long endTime = System.currentTimeMillis();
        System.out.println("remove middle time : " + (endTime-startTime));
    }

    public static void removeElementsLast(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        list.remove(list.size()-1);
        long endTime = System.currentTimeMillis();
        System.out.println("remove last time : " + (endTime-startTime));
    }
    public static void getElementsByIterator(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Iterator time : " + (endTime-startTime));
    }

    public static void getElementsByFor(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<list.size();i++) {
            Integer integer = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for time : " + (endTime-startTime));
    }

    public static void getElementsByForeach(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (Integer integer : list) {

        }
        long endTime = System.currentTimeMillis();
        System.out.println("for time : " + (endTime-startTime));
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        addElements(list);
//        addElementsRandom(list);
//        getElementsByIterator(list);
//        getElementsByFor(list);
//        getElementsByForeach(list);
        removeElements(list);
        removeElementsMiddle(list);
        removeElementsLast(list);
    }
}
