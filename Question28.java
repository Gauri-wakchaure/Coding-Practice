// From a list of integers, use filter() to print only even numbers.

import java.util.ArrayList;

class Question28 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(33);
        list.add(67);
        list.add(52);
        list.add(28);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.println(n));
    }
}