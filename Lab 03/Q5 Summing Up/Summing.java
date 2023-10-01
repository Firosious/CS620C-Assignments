public class Summing {
    public static void main(String args[]) {

        int divisSum = 0;
        int squarSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                divisSum += i;
            }
            squarSum += i * i;
        }
        System.out.println("The sum of all numbers divisible by 13 is " + divisSum);
        System.out.println("The sum of all squares is " + squarSum);
    }
}