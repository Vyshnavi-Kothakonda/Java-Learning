public class CalculateArrayProduct {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of Array Elements: " + product);
    }
}
