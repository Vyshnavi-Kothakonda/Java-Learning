class Animal {
    String type = "Animal";
}
class Dog extends Animal {
    String type = "Dog";
    void display() {
        System.out.println("Child Type: " + type);
        System.out.println("Parent Type: " + super.type);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
