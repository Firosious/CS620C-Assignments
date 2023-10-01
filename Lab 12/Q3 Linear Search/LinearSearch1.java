import java.util.Scanner;

public class LinearSearch1 {

    public static void main(String[] args) {
        double[] num = { 254.98, 3.43, 43321.54 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Search for: ");
        double element = sc.nextDouble();

        boolean isFound = findElement(num, element);
        if (isFound) {
            System.out.println(element + " was found in the array.");
        } else {
            System.out.println(element + " was NOT found in the array.");
        }
        sc.close();
    }

    public static boolean findElement(double[] array, double value) {
        for (double num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
