package org.example;

    import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int number = 2;


        while (primes.size() < n) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }


    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


