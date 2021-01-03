package cs.discrete.assignment.three;

public class main {
    public static void main(String[] args) {

        //Question 1
        //Test sieve of eratisthenes
//        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
//
//        sieveOfEratosthenes.printList(sieveOfEratosthenes.computePrimes(30));
//        TrialDivision.trialDivision(9);
//        ExtendedEuclidean ex = new ExtendedEuclidean();
//        int [] ans = ex.extEuclidean(10,7);
//        System.out.println(ans.toString());
        chineseReminder ch = new chineseReminder();
        int a[] = {3,1,6};
        int m[] = {5,7,8};
        System.out.println(ch.chinReminder(a,m));
    }
}
