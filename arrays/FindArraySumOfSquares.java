public class FindArraySumOfSquares {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }
        System.out.println("sum of squares = " + sum);
    }
}
