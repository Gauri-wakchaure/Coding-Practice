/* Create an ArrayList<Integer> and:
  1. add 5 numbers
  2. print all numbers
  3. remove one number
  4. check whether a particular number exists
 */

import java.util.ArrayList;

public class Question23 {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(43);
        list.add(83);
        list.add(20);
        list.add(15);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        System.out.println(list.contains(83));       
    }
}
