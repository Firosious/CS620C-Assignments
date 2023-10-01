public class HowMany {
    public static void main(String args[]) {
        int num1 = 40;
        int count = 0;

        while (num1 != 1) {
            num1 = num1 / 2;
            count++;
        }
        System.out.println(count);
    }
}