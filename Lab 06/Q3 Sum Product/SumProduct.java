import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int product = 1;
        int largestNumber = Integer.MIN_VALUE;

        for (int num : array) {
            sum += num;
            product *= num;
            if (num > largestNumber) {
                largestNumber = num;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest Number: " + largestNumber);
    }
}