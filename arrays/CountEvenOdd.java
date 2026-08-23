public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 33, 40, 51, 68};
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }
}
