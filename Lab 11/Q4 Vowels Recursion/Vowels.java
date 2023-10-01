import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Word: ");
        String word = sc.nextLine();

        System.out.println(vowelCount(word));
        sc.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int vowelCount(String word) {
        if (word.length() == 0) {
            return 0;
        }

        int count = isVowel(word.charAt(0)) ? 1 : 0;
        return count + vowelCount(word.substring(1));
    }
}
