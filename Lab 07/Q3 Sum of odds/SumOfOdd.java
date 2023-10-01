import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        int num1;
        int num2 = 0;
        int oddCounter = 0;
        int sumResultOfOdd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows: ");
        num1 = sc.nextInt();

        System.out.print("Number of columns: ");
        num2 = sc.nextInt();

        int[][] oddSums = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("Row " + (i + 1) + ": Enter int to input: ");
                oddSums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (oddSums[i][j] % 2 != 0) {
                    oddCounter++;
                    sumResultOfOdd += oddSums[i][j];
                }
            }
        }
        System.out.println("Odd number count: " + oddCounter);
        System.out.println("Sum of odd numbers: " + sumResultOfOdd);
        sc.close();
    }
}