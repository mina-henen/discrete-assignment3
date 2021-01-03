package cs.discrete.assignment.three;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    public static List<Integer> computePrimes(int maxLimit) {
        Boolean[] primesFlags = new Boolean[maxLimit + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < primesFlags.length; i++) {
            primesFlags[i] = true;
        }

        for (int i = 2; i * i < maxLimit; i++) {
            if (primesFlags[i]) {
                for (int j = i * i; j <= maxLimit ; j = j + i) {
                    primesFlags[j] = false;
                }
            }
        }

        for (int i = 2; i < primesFlags.length; i++) {
            if (primesFlags[i]) {
                primes.add(i);
            }
        }
        return primes;
    }


    public void printList (List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
