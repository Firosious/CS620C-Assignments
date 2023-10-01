import java.util.*;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of stars: ");
        int starNum = sc.nextInt();
        printStarTriangle(starNum);
        sc.close();
    }

    public static void printStarTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
