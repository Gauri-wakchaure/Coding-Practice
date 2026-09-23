public class Question19 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};

        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;

        try {
        for(int i = 0; i <= array.length+1; i++) {
             System.out.print(array[i]);
            System.out.print(" ");
        }    
        } catch(Exception e) {
            System.out.println();
            System.out.println("Array index of Bound error caught");
        }
    }
}
