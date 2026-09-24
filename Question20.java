// Reverse Array using Loops

public class Question20 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};

        int i = 0;
        int j = array.length-1;

        while(i<j) {   
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
        }

        for(int a=0; a<array.length; a++) {
            System.out.print(array[a]);
            System.out.print(" ");
        }
       
    }
}
