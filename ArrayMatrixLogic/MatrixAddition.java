package ArrayMatrixLogic;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();


        int [][] matrixA = new int[rows][cols];
        int [][] matrixB = new int[rows][cols];
        int [][] result = new int[rows][cols];


        //matrix A
        System.out.println("Enter the matrixA");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }


        //matrix B
        System.out.println("Enter the matrixB");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }


        //first matrixA
        System.out.println("First the matrixA");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(matrixA[i][j] +" ");
            }
            System.out.println();
        }


        //second matrixB
        System.out.println("Second the matrixB");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(matrixB[i][j] +" ");
            }
            System.out.println();
        }


        //Addition
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }


        //Addition result
        System.out.println("Result Addition");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
