// Create a Student class with a constructor that initializes name and marks.

class Question9 {
    public static void main(String[] args) {
        Student s1 = new Student("Gauri", 92);
        s1.displayInfo();

        Student s2 = new Student("Rehaa", 87);
        s2.displayInfo();
    }
}
class Student {
    String name;
    int marks;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}