public class Question13 {
    public static void main(String[] args) {
        int num = 30;
        int Array[] = {10,12,54,67,20,30,89,40,50};

        for(int i = 0; i<Array.length; i++) {
            if(num == Array[i]) {
                System.out.println("Number exists in Array");
             }
         }
    }
}