import java.util.*;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value to check: ");
        int numValue = sc.nextInt();
        if (isPrime(numValue) == true) {
            System.out.println(numValue + " is a prime number");
        } else {
            System.out.println(numValue + " is NOT a prime number");
        }
        sc.close();
    }

    public static boolean isPrime(int primeCheck) {
        int divis = 2;
        boolean check = true;
        if (primeCheck <= 1) {
            check = false;
        } else {
            do {
                if (primeCheck % divis == 0) {
                    check = false;
                    break;
                }
                divis++;
            } while (divis <= primeCheck / 2);
        }
        return check;
    }
}
