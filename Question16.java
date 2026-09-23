class Question16 {
    public static void main(String[] args) {
        String name = "ChatGPT";
        String reverse = "";
        int i = name.length()-1;

        while(i>=0){
            char last_char = name.charAt(i);
            reverse = reverse + last_char;
            i--;
        }
        System.out.println(reverse);
    }
}