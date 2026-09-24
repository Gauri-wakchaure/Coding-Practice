/* From a list of integers, use Stream API to:
   1. filter even numbers
   2. sort them
   3. collect them into a new list
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Question30 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(33);
        list.add(67);
        list.add(52);
        list.add(28);
        list.add(76);

        List<Integer> result = list.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .collect(Collectors.toList());
    System.out.println(result);
   }
}