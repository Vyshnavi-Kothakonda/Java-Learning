import java.util.LinkedList;
import java.util.Queue;
public class QueueIteration {
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();
        students.add("Vyshnavi");
        students.add("Anjali");
        students.add("Rahul");
        students.add("Sneha");
        System.out.println("Students in Queue:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
