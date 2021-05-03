import java.util.*;

public class MatrixFunctions {
    public static void main(String[] args) {
        EnterMatrix();
    }

    public static void EnterMatrix() {

        Scanner MatrixEnter = new Scanner(System.in);

        System.out.println("Welcome to Matrix Multiplication!");
        System.out.println("This function will take two user-inputed matrices of a certain dimension, and multiply them together.");

        System.out.print("Enter in # of rows for first matrix: ");
        int r1 = MatrixEnter.nextInt();
        System.out.print("Enter in # of columns for first matrix: ");
        int c1 = MatrixEnter.nextInt();
        System.out.print("Enter in # of rows for second matrix: ");
        int r2 = MatrixEnter.nextInt();
        System.out.print("Enter in # of columns for second matrix: ");
        int c2 = MatrixEnter.nextInt();

        while (c1 != r2)
        {
            System.out.println("ERROR: The matrix dimensions are not appropriate for matrix multiplication.");
            System.out.println("Please re-enter the matrices' dimensions so that column of first matrix equals row of second matrix.");
            MathMania.SleepXSeconds(2);

            System.out.println("Re-enter # of columns for first matrix: ");
            c1 = MatrixEnter.nextInt();
            System.out.println("Re-enter in # of rows for second matrix: ");
            r2 = MatrixEnter.nextInt();
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];

        for (int i = 0; i < r1; i++)
        {
           for (int j = 0; j < c1; j++)
           {
            System.out.print("Enter number for row ");
            System.out.print(i+1);
            System.out.print(", column ");
            System.out.print(j+1);
            System.out.print(": ");
            matrix1[i][j] = MatrixEnter.nextInt();
           }
        }

        System.out.format("First matrix is complete. Moving on to second matrix. \n");

        for (int k = 0; k < r2; k++)
        {
           for (int m = 0; m < c2; m++)
           {
            System.out.print("Enter number for row ");
            System.out.print(k+1);
            System.out.print(", column ");
            System.out.print(m+1);
            System.out.print(": ");
            matrix2[k][m] = MatrixEnter.nextInt();
           }
        }

        int[][] product = multiplyMatrices(matrix1, matrix2, r1, c1, c2);

        // Displaying the result
        displayProduct(product, r1, c2);
        MathMania.SleepXSeconds(5);

        System.out.println("Returing to home screen...");
        MathMania.SleepXSeconds(2);

        // return to MathMania screen...
        MathMania.WelcomeMessage();
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product, int r1, int c2) {
        System.out.println("Calculating the");
        System.out.print(r1);
        System.out.print("x");
        System.out.print(c2);
        System.out.print(" product of two matrices: \n");
        MathMania.SleepXSeconds(1);

        for(int[] row : product) {
            System.out.print("[");
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}