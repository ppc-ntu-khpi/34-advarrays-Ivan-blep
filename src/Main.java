import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Друк матриці перед заміною стовпців
        System.out.println("Матриця перед заміною:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Запит стовпців для заміни
        System.out.print("Введіть індекс першого стовпця для заміни: ");
        int col1 = input.nextInt();
        System.out.print("Введіть індекс другого стовпця для заміни: ");
        int col2 = input.nextInt();

        // Заміна стовпців в матриці
        MatrixColumnSwap.swapColumns(matrix, col1, col2);

        // Друк матриці після заміни стовпців
        System.out.println("Матриця після заміни:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
