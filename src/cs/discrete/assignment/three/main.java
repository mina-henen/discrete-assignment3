package cs.discrete.assignment.three;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the number of an algorithm");
            System.out.println("1- Sieve of Eratosthenes");
            System.out.println("2- Trial Division");
            System.out.println("3- Extended Euclidean");
            System.out.println("4- Chinese Remainder");
            System.out.println("5- Miller's Test");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to calculate the primes to that integer");
                    int limit = in.nextInt();
                    SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
                    System.out.println("Primes are");
                    SieveOfEratosthenes.printList(SieveOfEratosthenes.computePrimes(limit));
                    break;
                case 2:
                    System.out.println("Enter an integer");
                    int number = in.nextInt();
                    TrialDivision.trialDivision(number);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    return;
            }
        }
//        TrialDivision.trialDivision(9);
//        ExtendedEuclidean ex = new ExtendedEuclidean();
//        int [] ans = ex.extEuclidean(10,7);
//        System.out.println(ans.toString());
//        chineseReminder ch = new chineseReminder();
//        int a[] = {3,1,6};
//        int m[] = {5,7,8};
//        System.out.println(ch.chinReminder(a,m));
//        millerTest m = new millerTest();
//        System.out.println(m.isPrimeUseMillerTest(99,6));
    }
}