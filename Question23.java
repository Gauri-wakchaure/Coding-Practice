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
