interface Printable {
    void print();
}
interface Showable {
    void show();
}
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing data.");
    }
    public void show() {
        System.out.println("Showing data.");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
