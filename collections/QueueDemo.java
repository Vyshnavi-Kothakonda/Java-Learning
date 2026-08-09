import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Queue: " + numbers);
        System.out.println("Front Element: " + numbers.peek());
        System.out.println("Removed Element: " + numbers.poll());
        System.out.println("Queue After Removal: " + numbers);
        System.out.println("Is Queue Empty? " + numbers.isEmpty());
    }
}
