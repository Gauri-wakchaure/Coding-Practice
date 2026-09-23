import java.util.ArrayList;

public class Question24 {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();
          list.add("Apple");
          list.add("Mango");
          list.add("Banana");
          list.add("Strawberry");
          list.add("PineApple");
          //System.out.println(list);

        for(int i = 0; i<list.size(); i++) {
        if(list.get(i).length() > 5) {
            System.out.println(list.get(i)+ "-> "+list.get(i).length());
        }           
    }
    }
}

