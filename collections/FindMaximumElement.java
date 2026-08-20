public class FindMaximumElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34, 56};
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum Element: " + maximum);
    }
}
