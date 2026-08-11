import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vyshnavi");
        names.add("Anjali");
        names.add("Rahul");
        names.add("Sneha");
        Iterator<String> iterator = names.iterator();
        System.out.println("Student Names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
