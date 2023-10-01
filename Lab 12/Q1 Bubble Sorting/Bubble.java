import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("");
            array[i] = sc.nextInt();
        }

        int[] sortedArray = bubbleSorted(array);
        for (int i = 0; i < 15; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        sc.close();
    }

    public static int[] bubbleSorted(int[] array) {
        int temp = -1;
        int end = array.length - 1;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            end--;
        }
        return array;
    }
}
