public class Factorial {
    public static void main(String args[]) {

        int num = 7;
        long result = 1;
        int i = 1;

        while (i <= num) {
            result = result * i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + result);
    }
}