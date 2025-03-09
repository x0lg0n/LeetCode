class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int N = colors.length;
        int res = 0, l = 0;

        for (int r = 1; r < N + k - 1; r++) {
            if (colors[r % N] == colors[(r - 1) % N]) {
                l = r;
            }

            if (r - l + 1 > k) {
                l += 1;
            }

            if (r - l + 1 == k) {
                res += 1;
            }
        }
        return res;
    }
}