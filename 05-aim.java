// Write a program to find the trace and transpose of a matrix.

import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        // Input the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        displayMatrix(matrix);

        int trace = calculateTrace(matrix);
        System.out.println("Trace of the matrix: " + trace);

        int[][] transpose = calculateTranspose(matrix);
        System.out.println("Transpose of the matrix:");
        displayMatrix(transpose);

        sc.close();
    }

    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("Trace is only defined for square matrices.");
            return 0;
        }

        for (int i = 0; i < rows; i++) {
            trace += matrix[i][i];
        }

        return trace;
    }

    public static int[][] calculateTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * class diagram
 * MatrixOperations
 * - main(String[ ] args)
 * - calculateTrace(int[ ][ ] matrix): int
 * - calculateTranspose(int[ ][ ] matrix): int[ ][ ]
 * - displayMatrix(int[ ][ ] matrix): void
 */
