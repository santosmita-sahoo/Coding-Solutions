class Solution {
    public int termOfGP(int a, int b, int n) {
        if (n == 1) {
            return a;
        }

        int ratio = b / a;

        return a * (int)Math.pow(ratio, n - 1);
    }
}