import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for Matrix 1
        System.out.print("Enter rows and columns of Matrix 1: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                mat1[i][j] = sc.nextInt();

        // Input dimensions for Matrix 2
        System.out.print("Enter rows and columns of Matrix 2: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i
