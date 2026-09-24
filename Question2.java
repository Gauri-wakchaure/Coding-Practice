// Write a program to find the largest of three numbers.

class Question2 {
    public static void main(String[] args) {
          int num1 = 9811;
          int num2 = 993;
          int num3 = 3477;
        if(num1>num2 && num1>num3) {
            System.out.println("First Number is Greater");
        }else if(num2>num3) {
            System.out.println("Second Number is Greater");
        }else{
            System.out.println("Third Number is Greater");
        }
        
    }
}