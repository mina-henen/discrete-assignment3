package cs.discrete.assignment.three;

public class chineseReminder {

    public long chinReminder(int[] a, int[] m){
        int prdct = 1;
        long result = 0;

        for (int i : m) {prdct *= i;}
        for (int i = 0; i < a.length; i++)
        {
            int p = prdct / m[i];
            result += a[i] * modInverse(p, m[i]) * p;
        }
        return result%prdct;
    }

    static int modInverse(int a, int m)
    {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }
}
