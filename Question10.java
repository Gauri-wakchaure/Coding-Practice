// Find the largest element in an integer array.

class Question10 {
    public static void main(String[] args) {
        int Array[] = {12,34, 9, 87, 32, 90, 56, 28,78};
        int largest_ele = Array[0];

        for(int i = 0; i<Array.length; i++) {
            if(Array[i] > largest_ele) {
                largest_ele = Array[i];
            }
        }
        System.out.println(largest_ele+ " is the largest Element from Array");
    }
}