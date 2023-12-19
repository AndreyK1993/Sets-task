package sets;

import java.util.HashSet;
import java.util.Set;

public class Task01 {

    public static void main(String[] args) {
        Set<String> initialSet = getInitData();
        getSetInitial(initialSet);
        updateAndPrintSet(initialSet);
    }

    private static Set<String> getInitData() {
        Set<String> set = new HashSet<>();

        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");

        return set;
    }

    private static void getSetInitial(Set<String> set) {
        int count = 0;
        System.out.println("Initial data:");
        for (String item : set) {
            count++;
            System.out.println(count + ") " + item);
        }
    }

    private static void updateAndPrintSet(Set<String> set) {
        set.add("grape");
        int count = 0;
        System.out.println("\nUpdated data:");
        for (String item : set) {
            count++;
            System.out.println(count + ") " + item);
        }
    }
}
