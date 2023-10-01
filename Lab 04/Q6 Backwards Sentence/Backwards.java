public class Backwards {
    public static void main(String args[]) {

        String sentence = "pay no attention to that man behind the curtain";
        int end = sentence.length();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (i == 0 || sentence.charAt(i) == ' ') {
                if (i == 0) {
                    System.out.println(sentence.substring(i, end));
                } else {
                    System.out.println(sentence.substring(i + 1, end));
                }
                end = i;
            }
        }
    }
}