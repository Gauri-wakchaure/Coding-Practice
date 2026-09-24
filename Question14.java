// Count the vowels in a String.

class Question14 {
    public static void main(String[] args) {
        String name = "Gauree";
        int count = 0;

        for(int i = 0; i<name.length(); i++) {
        if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i'
          || name.charAt(i)=='o' || name.charAt(i)=='u') {
            count++;
          }
        }
        System.out.println("There are "+count+" Vowels in a String");
    }
}