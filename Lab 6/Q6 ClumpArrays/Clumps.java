import java.util.*;

public class Clumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int maxClumpSize = 0;
        int currentClumpSize = 1;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] == array[i + 1]) {
                currentClumpSize++;
            } else {
                if (currentClumpSize > maxClumpSize) {
                    maxClumpSize = currentClumpSize;
                }
                currentClumpSize = 1;
            }
        }

        if (currentClumpSize > maxClumpSize) {
            maxClumpSize = currentClumpSize;
        }

        System.out.println("The size of the largest clump is " + maxClumpSize);
        sc.close();
    }
}