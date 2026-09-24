import java.util.ArrayList;

class Question27 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);

        list.forEach (name -> System.out.println(name));
    }
}