public class ReverseString {
    public static void main(String args[]) {

        String reverse = "programming";

        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));
        }
    }
}