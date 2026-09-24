// Create a Student class with name and marks. Create an object and print the values.

class Question7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gauri";
        s1.marks = 92;
        s1.displayInfo();
    }
}
class Student {
    String name;
    int marks;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}