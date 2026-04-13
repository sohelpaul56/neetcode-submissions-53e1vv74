class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        long N = n;
        double result = 1;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        for (long i = 0; i < N; i++) {
            result *= x;
        }

        return result;
    }
}