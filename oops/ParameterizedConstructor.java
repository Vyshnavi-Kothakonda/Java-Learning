class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Vyshnavi", 19);
        Student s2 = new Student("Rahul", 20);
        s1.display();
        System.out.println();
        s2.display();
    }
}
