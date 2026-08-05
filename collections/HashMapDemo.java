import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Vyshnavi");
        students.put(102, "Rahul");
        students.put(103, "Anjali");
        System.out.println("Student Map: " + students);
        System.out.println("Student with ID 102: " + students.get(102));
        students.remove(103);
        System.out.println("After Removing ID 103: " + students);
        System.out.println("Contains ID 101? " + students.containsKey(101));
        System.out.println("Total Students: " + students.size());
    }
}
