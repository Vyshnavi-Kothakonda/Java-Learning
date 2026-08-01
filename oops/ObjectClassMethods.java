class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "Student Name: " + name;
    }
}
public class ObjectClassMethods {
    public static void main(String[] args) {
        Student s = new Student("Vyshnavi");
        System.out.println(s);
    }
}
