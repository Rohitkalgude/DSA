package ArrayMatrixLogic;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int columns = sc.nextInt();


        int [][]matrixA = new int [rows][columns];
        int [][]matrixB = new int [rows][columns];
        int [][]result = new int [rows][columns];



        //matrixA
        System.out.println("Enter the matrixA");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }

        //matrixB
        System.out.println("Enter the matrixB");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }


        //first matrixA
        System.out.println("Enter the matrixA");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(matrixA[i][j] +" ");
            }
            System.out.println();
        }


        //second matrixB
        System.out.println("Enter the matrixB");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(matrixB[i][j] +" ");
            }
            System.out.println();
        }


        //Multiplication
        System.out.println("result Multiplication");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                result[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }


        //result
        System.out.println("final answer Multiplication");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }
}
