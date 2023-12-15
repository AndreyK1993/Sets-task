package sets;

import java.util.HashSet;

public class Task01 {

    public static void main (String[] args){

        HashSet<String> set= new HashSet<>();

        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");

        System.out.println("\nInitial data: " + set);

        HashSet<String> set1 = new HashSet<>();

        set1.add("grape");
        set.addAll(set1);

        System.out.println("\nUpdated data: " + set);
    }
}
