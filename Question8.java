/* Create a Calculator class with overloaded add() methods:
   1. add(int, int)
   2. add(int, int, int)
   3. add(double, double)
 */

class Question8 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(12,45);
        c1.add(123, 456, 734);
        c1.add(120.4, 130.5);
    }
}
class Calculator {

    public void add(int a, int b) {
    System.out.println(a+b);
    }
    
    public void add(int a, int b, int c) {
    System.out.println(a+b+c);
    }
    
    public void add(double a, double b) {
    System.out.println(a+b);
    }        
}