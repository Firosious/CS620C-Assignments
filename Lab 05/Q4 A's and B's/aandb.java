import java.util.Scanner;

public class aandb {
    public static void main(String args[]) {
        int letterCount1 = 0;
        int letterCount2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter combination of a's and b's: ");
        String combination = sc.nextLine();

        for (int i = 0; i < combination.length(); i++) {
            if (combination.charAt(i) == 'a') {
                letterCount1++;
            } else if (combination.charAt(i) == 'b') {
                letterCount2++;
            } else {
                System.out.println("Invalid input");
            }
        }

        sc.close();
        System.out.println(letterCount1 + " a's and " + letterCount2 + " b's");

        if (letterCount1 == letterCount2) {
            System.out.println("Match");
        } else {
            System.out.println("No Match");
        }
    }
}