
public class MatrixColumnSwap {
    public static void swapColumns(int[][] matrix, int col1, int col2) {
        for (int[] row : matrix) {
            int temp = row[col1];
            row[col1] = row[col2];
            row[col2] = temp;
        }
    }
}
