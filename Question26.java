import java.util.HashMap;

class Question26 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // Duplicate Keys, Elements not allowed
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "PineApple");
        map.put(4, "Strawberry");
       
        System.out.println(map);
    }
}