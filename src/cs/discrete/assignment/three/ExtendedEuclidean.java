package cs.discrete.assignment.three;

public class ExtendedEuclidean {

    public int[] extEuclidean(int n1, int n2) {
        if (n2 == 0)
            return new int[]{n1, 1, 0};

        int[] ans = extEuclidean(n2, n1 % n2);
        int d = ans[0];
        int a = ans[2];
        int b = ans[1] - (n1 / n2) * ans[2];
        return new int[]{d, a, b};
    }

}
