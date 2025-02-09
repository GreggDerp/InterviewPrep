public class PrimeNumber {
    public static void main(String[] args) {
        checkIsPrime(10);
        checkIsPrime(1);
        checkIsPrime(2);
        checkIsPrime(-1);
        checkIsPrime(9);
        checkIsPrime(3);
        checkIsPrime(11);
    }

    public static void checkIsPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return true;
    }
}
