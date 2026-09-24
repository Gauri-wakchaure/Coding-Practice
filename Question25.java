// Create a HashSet<Integer> and add duplicate numbers. Print the set and observe what happens to duplicates.

import java.util.HashSet;

class Question25 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(12);
        set.add(45);
        set.add(89);
        set.add(14);
        set.add(76);
        // Duplicate Elements not allowed
        set.add(45);
        set.add(12);
        System.out.println(set);
    }
}