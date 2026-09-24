import java.util.ArrayList;

class Question29 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(33);
        list.add(67);
        list.add(52);
        list.add(28);
        list.add(76);

        list.stream()
            .filter(n -> n > 50)
            .forEach(n -> System.out.println(n));
    }
}