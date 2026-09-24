// Write a program that handles division by zero using try-catch.

public class Question22 {
    public static void main(String[] args) {

        int num1 = 22;
        int num2 = 0;

        try {
            int result = num1 / num2;
        } catch(Exception e) {
            System.out.println("Any number Can't divide by Zero");
        }       
    }
}
