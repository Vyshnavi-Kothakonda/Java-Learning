import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        System.out.println("Before Sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After Sorting: " + numbers);
        Collections.reverse(numbers);
        System.out.println("After Reversing: " + numbers);
    }
}
