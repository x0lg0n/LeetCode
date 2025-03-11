class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();

        // Track last position of a, b, c 
        int[] lastPos = { -1, -1, -1 };
        int cnt = 0;

        for (int r = 0; r < len; r++) {
            // Update last position of currrent character 
            lastPos[s.charAt(r) - 'a' ] = r;

            cnt += 1 + Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
        }

        return cnt;
    }
}