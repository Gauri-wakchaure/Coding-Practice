//From a list of integers, use map() to create a new list containing the squares of each number.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Question30 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(42);
        list.add(8);
        list.add(31);
        list.add(6);
        list.add(5);
        list.add(12);
        list.add(7);

        List<Integer> result = list.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
    System.out.println(result);
   }
}