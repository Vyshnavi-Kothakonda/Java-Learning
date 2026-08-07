import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        System.out.println("Priority Queue: " + numbers);
        System.out.println("Smallest Element: " + numbers.peek());
        System.out.println("Removed Element: " + numbers.poll());
        System.out.println("After Removal: " + numbers);
    }
}
