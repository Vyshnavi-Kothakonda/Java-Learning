import java.util.Scanner;
public class UpperLowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
