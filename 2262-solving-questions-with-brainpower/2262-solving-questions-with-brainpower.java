class Solution {
    public long mostPoints(int[][] ques) {
        int n = ques.length;
        Long[] memo = new Long[n];
        return check(ques, 0, memo);
    }
    private long check(int[][] ques, int i, Long[] memo) {
        if(i >= ques.length) return 0;
        if(memo[i] != null) return memo[i];
        return memo[i] = Math.max(check(ques, i + 1, memo), ques[i][0] + check(ques, i + ques[i][1] + 1, memo));
    }
}