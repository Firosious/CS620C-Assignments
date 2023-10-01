import java.util.Scanner;

public class Compare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Int input 1: ");
        int num1 = sc.nextInt();
        System.out.println("Int input 2: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }
        sc.close();
    }
}