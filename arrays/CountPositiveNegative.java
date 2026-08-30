public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 20, -8, 0, 15, -3};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int number : numbers) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}
