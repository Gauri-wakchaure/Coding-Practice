// Calculate the sum and average of all elements in an array.

class Question12 {
    public static void main(String[] args) {
        int Array[] = {10,20,30,40,50};
        int sum = 0;
        int average = 0;

        for(int i = 0; i<Array.length; i++) {
            sum = sum + Array[i];
        }
        System.out.println(sum);
        
        average = sum / 10;
        System.out.println(average);
    }
}