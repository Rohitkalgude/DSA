package ArrayMatrixLogic;

public class MatrixAddition {
    public static void main(String[] args) {

        int[][] matrixA = {
                {1,2,3},
                {4,5,6}
        };

        int[][] matrixB = {
                {7,8,9},
                {10,11,12}
        };

        int Addition = 0;

        for (int i=0; i<matrixA.length; i++){
            for (int j=0; j<matrixB.length; j++){
                Addition = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println(" result of addition "+Addition);
    }
}
