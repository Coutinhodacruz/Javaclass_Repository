package ChapterSeven;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        boolean[] primes = new boolean[1000]; // By default, all elements in the boolean array are initialized to false.

        // Step 1: Initialize the array with all elements as true except 0 and 1.
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // Step 2: Apply the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        // Step 3: Display prime numbers
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
