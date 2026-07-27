class Student {
    final int age = 19;
    void display() {
        System.out.println("Age: " + age);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
