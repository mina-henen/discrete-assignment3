package cs.discrete.assignment.three;

public class ChineseReminder {

    public long chineseReminder(int[] a, int[] m){

        /*initialize the product with 1 and the result with 0 */
        int prdct = 1;
        long result = 0;

        /* calculate the product of the m numbers */
        for (int i : m) {prdct *= i;}

        /* calculate the sum of a * (product/m) * (modular multiplicative inverse of (product/m) under mod m) */
        for (int i = 0; i < a.length; i++)
        {
            int p = prdct / m[i];
            result += a[i] * modInverse(p, m[i]) * p;
        }
        /* return the sum%product */
        return result%prdct;
    }

    /* find modular multiplicative inverse of a under modulo m */
    static int modInverse(int a, int m)
    {
        a = a%m;
        for (int i = 1; i < m; i++)
            if ((a * i) % m == 1)
                return i;
        return 1;
    }
}
