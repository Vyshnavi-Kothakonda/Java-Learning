public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 40, 5, 30, 15};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
