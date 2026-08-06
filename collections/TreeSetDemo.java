import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        System.out.println("TreeSet: " + numbers);
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        numbers.remove(20);
        System.out.println("After Removing 20: " + numbers);
    }
}
