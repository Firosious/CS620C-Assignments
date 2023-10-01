import java.util.Scanner;

public class printEvenPosition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}