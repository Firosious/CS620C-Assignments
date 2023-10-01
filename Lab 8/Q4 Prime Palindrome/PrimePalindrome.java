import java.util.*;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter num to check: ");
        int N = sc.nextInt();
        while (true) {
            if (isPrime(N) && isPalindrome(N)) {
                System.out.println("The next prime palidrome is " + N);
                break;
            }
            N++;
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        int divis = 2;
        boolean check = true;
        if (n <= 1) {
            check = false;
        } else {
            do {
                if (n % divis == 0) {
                    check = false;
                    break;
                }
                divis++;
            } while (divis <= n / 2);
        }
        return check;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}