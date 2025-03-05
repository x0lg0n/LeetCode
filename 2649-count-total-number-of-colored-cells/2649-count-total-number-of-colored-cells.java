class Solution {
    public long coloredCells(int n) {
        // 1 + 4.1 + 4.2 + 4.3 + ....
        return 1 + 2L * n * (n - 1);
    }
}