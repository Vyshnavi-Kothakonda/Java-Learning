import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int zeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        if (zeroCount > (rows * cols) / 2) {
            System.out.println("It is a Sparse Matrix.");
        } else {
            System.out.println("It is not a Sparse Matrix.");
        }
    }
}
