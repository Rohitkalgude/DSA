package ArrayMatrixLogic;

import java.util.Scanner;

public class MatrixSymmetric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int columns = sc.nextInt();

        if (rows != columns){
            System.out.println("Matrix must be square to check for symmetry.");
            return;
        }

        int [][] matrix = new int [rows][columns];


        System.out.println("Enter the elements of matrixA:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("Original Matrix (matrixA):");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print( matrix[i][j] +" ");
            }
            System.out.println();
        }


        if (isSymmetric(matrix)){
            System.out.println("Matrix is symmetric.");
        }
        else {
            System.out.println("Not Matrix is symmetric.");

        }
    }

    public static boolean isSymmetric(int [][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
