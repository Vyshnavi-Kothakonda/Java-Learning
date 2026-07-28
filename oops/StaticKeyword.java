class Student {
    static String college = "SWEC";
    String name;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Vyshnavi");
        Student s2 = new Student("Rahul");
        s1.display();
        System.out.println();
        s2.display();
    }
}
