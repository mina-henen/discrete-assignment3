package cs.discrete.assignment.three;

public class ExtendedEuclidean {

    public int[] extendedEuclidean(int n1, int n2) {
        /* if the second number is 0 return first number,1,0 */
        if (n2 == 0)
            return new int[]{n1, 1, 0};
        /* perform recursion algorithm till n2 = 0
        * save gcd, a and b from the array */
        int[] ans = extendedEuclidean(n2, n1 % n2);
        int gcd = ans[0];
        int a = ans[2];
        int b = ans[1] - (n1 / n2) * ans[2];
        /* return the new answer array */
        return new int[]{gcd, a, b};
    }

}
