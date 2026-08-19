import java.util.HashMap;
public class HashMapFrequency {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }
        System.out.println("Number Frequencies:");
        for (int number : frequency.keySet()) {
            System.out.println(number + " -> " + frequency.get(number));
        }
    }
}
