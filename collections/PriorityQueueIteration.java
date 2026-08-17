import java.util.PriorityQueue;
public class PriorityQueueIteration {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        System.out.println("Priority Queue Elements:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
