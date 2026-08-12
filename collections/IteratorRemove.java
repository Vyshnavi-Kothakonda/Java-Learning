import java.util.ArrayList;
import java.util.Iterator;
public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number == 20) {
                iterator.remove();
            }
        }

        System.out.println("After Removing 20: " + numbers);
    }
}
