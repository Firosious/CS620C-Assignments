import java.util.Scanner;

public class arraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arraySwap = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the elements of the array at" + (i + 1) + " position: ");
            arraySwap[i] = sc.nextInt();
        }

        for (int num : arraySwap) {
            System.out.print(num + " ");
        }

        System.out.println();

        int temp = arraySwap[0];
        arraySwap[0] = arraySwap[4];
        arraySwap[4] = temp;

        for (int num : arraySwap) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}