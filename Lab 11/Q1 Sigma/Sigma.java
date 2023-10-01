import java.util.Scanner;

public class Sigma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(computeSigma(num));
        sc.close();
    }

    public static int computeSigma(int num) {
        if (num == 1) {
            return 1;
        }
        return num + computeSigma(num - 1);
    }
}
