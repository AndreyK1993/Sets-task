package sets;

import java.util.HashSet;
import java.util.Set;

public class Task02 {

    public static void main (String[] args){

        Set<String> set= new HashSet<>();

        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");

        System.out.println("Initial data: ");
        printSet(set);

        set.remove("kiwi");

        System.out.println("\nUpdated data: ");
        printSet(set);
    }
    private static void printSet(Set<String> set) {
        int index = 1;
        for (String item : set) {
            System.out.println(index + ") " + item);
            index++;
        }
    }
}
