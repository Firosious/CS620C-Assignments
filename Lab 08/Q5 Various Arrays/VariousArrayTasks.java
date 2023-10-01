import java.util.*;

public class VariousArrayTasks {
    public static void main(String[] args) {
        int[] arrayFilled = fillArray();
        int sum = sumArray(arrayFilled);
        double avg = avgArray(arrayFilled, sum);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        printArray(arrayFilled);
    }

    public static int[] fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int arrayLength = sc.nextInt();
        int[] array1 = new int[arrayLength];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter value for position " + (i + 1) + " of the array: ");
            array1[i] = sc.nextInt();
        }
        sc.close();
        return array1;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double avgArray(int[] array, int sum) {
        double average = 0;
        average = (double) sum / array.length;
        return average;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}