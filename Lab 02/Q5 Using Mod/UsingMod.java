public class UsingMod {
    public static void main(String args[]) {
        int num = 123;

        int firstNum;
        int midNum;
        int lastNum;

        firstNum = num / 100;
        midNum = num % 100 / 10;
        lastNum = num % 10;

        System.out.println("The digits in the number " + num + " are:");
        System.out.println(firstNum);
        System.out.println(midNum);
        System.out.println(lastNum);

    }
}