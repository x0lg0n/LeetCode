class Solution {
    public long coloredCells(int n) {
        // 1 + 4.1 + 4.2 + 4.3 + ....
        long res  = 1;
        // 0...n-1
        for (int i = 0; i < n; i++){
            res += (4*i);
        }
        return res;
    }
}