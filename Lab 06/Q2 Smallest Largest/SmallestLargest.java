import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter the elements of the array at " + (i + 1) + " position: ");
            numbers[i] = sc.nextInt();
        }

        int smallest = numbers[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                indexOfSmallest = i;
            }
        }

        int largest = numbers[0];
        int indexOfLargest = 0;
        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                indexOfLargest = i;
            }
        }

        int temp = numbers[0];
        numbers[0] = smallest;
        numbers[indexOfSmallest] = temp;

        if (indexOfLargest != 0) {
            temp = numbers[arraySize - 1];
            numbers[arraySize - 1] = largest;
            numbers[indexOfLargest] = temp;
        } else {
            numbers[indexOfSmallest] = numbers[arraySize - 1];
            numbers[arraySize - 1] = largest;
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}