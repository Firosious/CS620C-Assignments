import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Word to reverse: ");
        String word = sc.nextLine();

        System.out.println(reverseString(word));
        sc.close();
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
