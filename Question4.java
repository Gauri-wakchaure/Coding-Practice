class Question4 {
    public static void main(String[] args) {
          int num = 1234567;
          int reverse = 0;

         while(num != 0) {
         int last_digit = num % 10;
         num = num / 10;
         reverse = reverse * 10 + last_digit;
         }
        System.out.println(reverse);
    }
}