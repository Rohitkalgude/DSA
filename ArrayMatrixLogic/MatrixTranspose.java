package ArrayMatrixLogic;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();


        int [][] matrixA = new int[rows][cols];
        int [][] Transpose = new int[rows][cols];


        System.out.println("Enter the elements of matrixA:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }


        System.out.println("Original Matrix (matrixA):");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(matrixA[i][j] +" ");
            }
            System.out.println();
        }


        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                Transpose[j][i] = matrixA[i][j];
            }
        }


        System.out.println("final Transpose");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(Transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
}
