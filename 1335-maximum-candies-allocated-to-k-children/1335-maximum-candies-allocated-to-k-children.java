class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1, high = 10_000_000;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long childCnt = 0;

            for ( int candy : candies) {
                childCnt += candy / mid;
            }
            
            if (childCnt >= k) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return result;
    }
}