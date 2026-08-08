import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        System.out.println("Stack: " + numbers);
        System.out.println("Top Element: " + numbers.peek());
        System.out.println("Removed Element: " + numbers.pop());
        System.out.println("Stack After Removal: " + numbers);
        System.out.println("Is Stack Empty? " + numbers.isEmpty());
    }
}
