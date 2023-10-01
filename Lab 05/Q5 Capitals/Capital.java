import java.util.Scanner;

public class Capital {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();
        String lower = sentence.toLowerCase();
        String upper = sentence.toUpperCase();
        String resultSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (i == 0 || sentence.charAt(i - 1) == ' ') {
                resultSentence += upper.charAt(i);
            } else {
                resultSentence += lower.charAt(i);
            }
        }
        System.out.println(resultSentence);
        sc.close();
    }
}