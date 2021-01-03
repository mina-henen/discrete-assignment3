package cs.discrete.assignment.three;

public class main {
    public static void main(String[] args) {

        //Question 1
        //Test sieve of eratisthenes
//        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
//
//        sieveOfEratosthenes.printList(sieveOfEratosthenes.computePrimes(30));
//        TrialDivision.trialDivision(9);
        ExtendedEuclidean ex = new ExtendedEuclidean();
        int [] ans = ex.gcd(252,198);
        System.out.println(ans.toString());
    }
}
