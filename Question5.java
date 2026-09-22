class Question5 {
    public static void main(String[] args) {
          int num = 1234;
          int sum = 0;

         while(num != 0) {
         int last_digit = num % 10;
         num = num / 10;
         sum = sum + last_digit;
         }
        System.out.println(sum);
    }
}