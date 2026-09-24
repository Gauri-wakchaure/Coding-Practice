// Create a method findLargest(int a, int b, int c) that returns the largest number

public class Question18 {
    public static void main(String[] args) {
        Find_Largest f1 = new Find_Largest();
        System.out.println(f1.findLargest(23,56,45));   
    }
}
class Find_Largest {
        public static int findLargest(int a, int b, int c) {
               if(a > b && a > c) {
                   return a;
               } else if(b > c) {
                   return b;
               } else {
                   return c;
               }
     } 
} 