class Student {
    {
        System.out.println("Instance Initializer Block");
    }
    Student() {
        System.out.println("Constructor Called");
    }
}
public class InstanceInitializerBlock {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
