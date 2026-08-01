class Demo {
    static {
        System.out.println("Static block executed.");
    }
    Demo() {
        System.out.println("Constructor executed.");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
