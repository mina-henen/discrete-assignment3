package cs.discrete.assignment.three;

import java.util.List;

public class TrialDivision {

    public static void trialDivision (int number) {
        Boolean isComposite = false;
        //calculate primes using sieve of eratosthenes
        List<Integer> primes = SieveOfEratosthenes.computePrimes((int) Math.ceil(Math.sqrt(number)));

        for (int i = 2; i < primes.size(); i++) {
            //checking if the number is composite
            if (number % primes.get(i) == 0) {
                System.out.println("The entered number is Composite");
                isComposite = true;
            }
        }
        //if the isComposite flag remains false after the loop
        //then the number is a prime number
        if (!isComposite) {
            System.out.println("The entered number is Prime");
        }
    }

}
