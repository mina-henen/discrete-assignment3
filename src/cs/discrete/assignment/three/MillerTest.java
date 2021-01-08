package cs.discrete.assignment.three;

public class MillerTest {

    static int power(int x, int y, int p) {
        /* calculate a^d %n */

        x = x % p;
        int res = 1;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y /=2;
            x = (x * x) % p;
        }
        return res;
    }

    /* m is an odd number such that d*2^r = n-1 for some r >= 1*/
    static boolean millersTest(int m, int n) {

        /* pick a random number */
        int a = 2 + (int)(Math.random() % (n - 4));

        /* calculate a^m %n */
        int x = power(a, m, n);
        /* square x till reach n-1
        * if x^2 % n = 1 return false
        * if x^2 % n = n-1 return true */
        if (x == 1 || x == n - 1) {return true;}
        while (m != n - 1) {
            x = (x * x) % n;
            m *= 2;
            if (x == 1) {return false;}
            if (x == n - 1) {return true;}
        }
        return false;
    }

    /* return false if not prime
    * return true if probably prime
    * k is number of iterations (more k more accuracy)*/
    public boolean isPrimeUseMillerTest(int n, int k) {

        if (n <= 1 || n == 4) { return false;}
        if (n <= 3){ return true;}
        /* compute d */
        int d = n - 1;
        while (d % 2 == 0)
            d /= 2;

        /*perform miller's test k times*/

        for (int i = 0; i < k; i++)
            if (!millersTest(d, n))
                return false;

        return true;
    }
}
