public class Primes {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;
        int divis = 2;

        if (num <= 1) {
            isPrime = false;
        } else {
            do {
                if (num % divis == 0) {
                    isPrime = false;
                    break;
                }
                divis++;
            } while (divis <= num / 2);
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}