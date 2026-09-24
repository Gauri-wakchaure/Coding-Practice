// Create a method reverseNumber(int num) that returns the reversed number 

public class Question21 {
    public static void main(String[] args) {
        ReverseNum r1 = new ReverseNum();
        System.out.println(r1.reverseNumber(1234));

        ReverseNum r2 = new ReverseNum();
        System.out.println(r2.reverseNumber(654321));
    }
}
class ReverseNum {
     int num;
     int reverse = 0;
    
     public int reverseNumber(int num) {
        while(num!=0) {
        int last_digit = num % 10;
        num = num / 10;
        reverse = reverse * 10 + last_digit;
       }    
          return reverse;
   }
}
