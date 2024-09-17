public class PrimeNumberChallenge {

    public static void main(String[] args){

        /*System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");*/

        primeCounter(1, 1000);

    }

    public static void primeCounter(int num1, int num2){

        int primeCount = 0;

        if (num1 > 1000 || num2 > 1000){
            System.out.println("Maximum number must be less than or equal to 1,000");
        } else {
            for (int pCheck = num1; pCheck <= num2; pCheck++){
                if (isPrime(pCheck) == true){
                    System.out.println(pCheck + " is prime number " + (primeCount + 1));
                    primeCount = primeCount + 1;
                }
                if (primeCount == 100){
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if (wholeNumber%divisor == 0){
                return false;
            }
        }
        return true;
    }
}
