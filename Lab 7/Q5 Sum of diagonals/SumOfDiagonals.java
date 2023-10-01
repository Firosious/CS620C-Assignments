import java.util.*;

public class SumOfDiagonals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int size = sc.nextInt();

        int[][] array = new int[size][size];

        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        for (int i = 0; i < size; i++) {
            diagonalSum1 += array[i][i];
            diagonalSum2 += array[i][size - i - 1];
        }

        int totalSum = diagonalSum1 + diagonalSum2;
        System.out.println("Sum of diagonals = " + totalSum);
    }
}