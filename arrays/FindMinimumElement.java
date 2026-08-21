public class FindMinimumElement {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 23, 9, 56};
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        System.out.println("Minimum Element: " + minimum);
    }
}
