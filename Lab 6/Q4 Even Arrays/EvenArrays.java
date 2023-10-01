import java.util.Scanner;

public class EvenArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Starting number: ");
        int startNum = sc.nextInt();

        int[] array = new int[10];
        int evenNumber = startNum + (startNum % 2 == 0 ? 2 : 1);

        for (int i = 0; i < 10; i++) {
            array[i] = evenNumber;
            evenNumber += 2;
        }

        while (true) {
            System.out.println("Position in the array (-1 to stop): ");
            int position = sc.nextInt();

            if (position == -1) {
                break;
            } else if (position >= 0 && position < 10) {
                System.out.println("Position " + position + ": " + array[position]);
            } else {
                System.out.println("Position " + position + ": No such index!");
            }
        }
        sc.close();
    }
}