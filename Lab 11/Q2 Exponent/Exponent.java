import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num 1: ");
        int x = sc.nextInt();

        System.out.print("Num 2: ");
        int y = sc.nextInt();

        System.out.println(powerTo(x, y));
        sc.close();
    }

    public static int powerTo(int x, int y) {
        if (y != 0) {
            return x * powerTo(x, y - 1);
        } else {
            return 1;
        }
    }
}
