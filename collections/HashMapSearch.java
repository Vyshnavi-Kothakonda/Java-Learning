import java.util.HashMap;
public class HashMapSearch {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Vyshnavi");
        students.put(102, "Anjali");
        students.put(103, "Rahul");
        int searchId = 102;
        if (students.containsKey(searchId)) {
            System.out.println("Student Found: " + students.get(searchId));
        } else {
            System.out.println("Student Not Found");
        }
    }
}
