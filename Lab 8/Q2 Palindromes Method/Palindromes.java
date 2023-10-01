import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter word to check: ");
        String palindromeInput = sc.next();
        palindromeInput = palindromeInput.toUpperCase();
        if (isPalindrome(palindromeInput) == true) {
            System.out.println(palindromeInput + " is a Palindrome");
        } else {
            System.out.println(palindromeInput + " is NOT a Palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String word) {
        String reverseWord = "";
        boolean check = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.equals(reverseWord)) {
            check = true;
            return check;
        } else {
            check = false;
            return check;
        }
    }
}
