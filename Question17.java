// Create a method isEven(int num) that returns true if the number is even, otherwise false.

public class Question17 {
    public static void main(String[] args) {
        Even_Odd e1 = new Even_Odd();
        System.out.println(e1.isEven(92));  
        System.out.println(e1.isEven(43)); 
    }
}
class Even_Odd {
        public static boolean isEven(int num) {
               if(num % 2 == 0) {
                     return true;
               } else {
                    return false;
            }
      }
}