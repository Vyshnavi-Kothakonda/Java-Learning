import java.util.HashMap;
import java.util.Map;
public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Vyshnavi");
        students.put(102, "Anjali");
        students.put(103, "Rahul");
        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }
    }
}
