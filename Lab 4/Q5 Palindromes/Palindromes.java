public class Palindromes {
    public static void main(String args[]) {

        String text = "navan";
        String reverse = "";
        text = text.toUpperCase();

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is NOT a palindrome");
        }
    }
}