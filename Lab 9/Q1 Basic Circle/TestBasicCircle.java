import java.util.*;

public class TestBasicCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicCircle[] circle = new BasicCircle[3];

        for (int i = 0; i < 3; i++) {
            int radius = sc.nextInt();
            circle[i] = new BasicCircle(radius);
        }

        for (int i = 0; i < circle.length; i++) {
            System.out.println("Circle " + (i + 1) + " has a radius of " + circle[i].getRadius());  // Missing code here
        }

        for (int i = 0; i < circle.length; i++) {
            System.out.println("Circle " + (i + 1) + " has a circumference of " + circle[i].getCircumference());  // Missing code here
        }

        for (int i = 0; i < circle.length; i++) {
            System.out.println("Circle " + (i + 1) + " has an area of " + circle[i].getArea());  // Missing code here
        }

        sc.close();
    }
}
