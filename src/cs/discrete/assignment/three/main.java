package cs.discrete.assignment.three;

import java.util.Scanner;

public class main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
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
                    System.out.println("Enter 2 integers");
                    int n1 = in.nextInt();
                    int n2 = in.nextInt();
                    ExtendedEuclidean ex = new ExtendedEuclidean();
                    int[] res = ex.extendedEuclidean(n1,n2);
                    System.out.println("The GCD is " + res[0]);
                    System.out.println("The Bezout coefficients are " + res[1] + " and " + res[2]);
                    break;
                case 4:
                    System.out.println("Enter the number of expressions");
                    int n = in.nextInt();
                    System.out.println("Enter the numbers before mod");
                    int [] a = read(n);
                    System.out.println("Enter the mod numbers");
                    int [] m = read(n);
                    ChineseReminder chr = new ChineseReminder();
                    long x = chr.chineseReminder(a,m);
                    System.out.println("X = "+x);
                    break;
                case 5:
                    System.out.println("Enter an integer");
                    int num = in.nextInt();
                    System.out.println("Enter number of iterations (more iterations more accuracy)");
                    int k = in.nextInt();
                    MillerTest mt = new MillerTest();
                    boolean ans = mt.isPrimeUseMillerTest(num,k);
                    String answer = ans? "The number "+Integer.toString(num)+" is prime using miller's test.":"The number "+Integer.toString(num)+" is not prime using miller's test.";
                    System.out.println(answer);
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

    public static int[] read(int n) {
        int[] arr = new int[n];
        for (int i=0; i<n; ++i){
            arr[i]= in.nextInt();
        }
        return arr;
    }
}