public class DiagonalDifference {
    public static void diagonalDifference(int matrix[][]) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<matrix.length; i++) {
            // for(int j = 0; j<matrix[0].length; j++ ) {
            //     if(i == j) {
            //         sum1 += matrix[i][j];
            //     }
            //     if(i+j == matrix.length-1){
            //         sum2 += matrix[i][j];
            //     }
            // }

            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }
        System.out.println(Math.abs(sum1-sum2));
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 11, 2, 4 },
                { 4, 5, 6 },
                { 10, 8, -12 },
        };
        diagonalDifference(matrix);
    }
}
