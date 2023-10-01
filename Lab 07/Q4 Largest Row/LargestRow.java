import java.util.*;

public class LargestRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the 2D array: ");
        int size = sc.nextInt();

        int[][] array = new int[size][size];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int largestSum = Integer.MIN_VALUE;
        int largestRowIndex = -1;
        for (int i = 0; i < size; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < size; j++) {
                currentRowSum += array[i][j];
            }
            if (currentRowSum > largestSum) {
                largestSum = currentRowSum;
                largestRowIndex = i;
            }
        }
        System.out.println("Largest row = R" + (largestRowIndex + 1));
        sc.close();
    }
}