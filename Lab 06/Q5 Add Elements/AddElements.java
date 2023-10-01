import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 decimal point ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        for (int i = 1; i < numbers.length; i++) {
            double sum = (double) Math.round((numbers[i] + numbers[i - 1]) * 100) / 100;
            System.out.println(numbers[i] + " + " + numbers[i - 1] + " = " + sum);
        }
        sc.close();
    }
}