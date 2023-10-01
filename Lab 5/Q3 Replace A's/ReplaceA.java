import java.util.Scanner;

public class ReplaceA {
    public static void main(String args[]) {
        String resultSentence = "";
        int aLetterCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                aLetterCount++;
            } else {
                continue;
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            resultSentence = sentence.charAt(i) == 'a' && aLetterCount <= 3 ? resultSentence + "#"
                    : sentence.charAt(i) == 'a' && aLetterCount > 3 ? resultSentence + "@"
                            : resultSentence + sentence.charAt(i);
        }
        System.out.println(resultSentence);
        sc.close();
    }
}