// Write a program to check whether a number is a palindrome: Example: 121 → Palindrome

class Question6 {
    public static void main(String[] args) {
          int num = 121;
          int copy = num;
          int result = 0;

         while(num != 0) {
         int last_digit = num % 10;
         num = num / 10;
         result = result * 10 + last_digit;
         }

        if(copy == result) {
            System.out.println(result+" is Palindrome number");
        }else {
            System.out.println(result+" is not Palidrome number");
        }
    }s
}