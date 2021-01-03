package cs.discrete.assignment.three;

public class ExtendedEuclidean {

    public int[] gcd(int p, int q) {
        if (q == 0)
            return new int[]{p, 1, 0};
        
        int[] ans = gcd(q, p % q);
        int d = ans[0];
        int a = ans[2];
        int b = ans[1] - (p / q) * ans[2];
        return new int[]{d, a, b};
    }
}
