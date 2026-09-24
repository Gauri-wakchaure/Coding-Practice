// Reverse an array

class Question15 {
    public static void main(String[] args) {
       int Array[] = {10, 20, 30, 40, 50, 60};
       int reverse[] = new int[Array.length];
       int j = 0;

        for(int i = Array.length-1; i>=0; i--){
            reverse[j] = Array[i];
            j++;
        }
          for(int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
              System.out.print(" ");
        }
    }
}