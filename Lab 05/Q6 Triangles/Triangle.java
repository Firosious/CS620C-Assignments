import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of side 3: ");
        int side3 = sc.nextInt();

        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Not a triangle");
        }
        sc.close();
    }
}