class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] freq = new int[100];  // Enough to store keys from 11 to 99
        int count = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);  // Normalize

            count += freq[key];  // All previously seen same dominoes form new pairs
            freq[key]++;         // Increment the count of this normalized domino
        }

        return count;
    }
}