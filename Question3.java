// Write a program to check whether a number is prime.

class Question3 {
    public static void main(String[] args) {
          int num = 15;
          int count = 0;
    
        for(int i=1; i<50; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        
         if(count==2) {
             System.out.println("Prime number");
         }else{
             System.out.println("Not a Prime number");
         }
        
    }
}