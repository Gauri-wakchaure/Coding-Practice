// Count how many even and odd numbers are present in an array.

class Question11 {
    public static void main(String[] args) {
        int Array[] = {12, 34, 9, 87, 32, 90, 13, 67, 64, 85, 56, 28, 78};
        int count = 0;
        for(int i = 0; i<Array.length; i++) {
            if(Array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count+" Even numbers is present in the array");

        int count1 = 0;
        for(int j = 0; j<Array.length; j++) {
            if(Array[j] % 2 != 0) {
                count1++;
            }
        }
        System.out.println(count1+ " Odd Numbers is present in the array");        
    }
}
