class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int first = firstOccurence(nums, target, n);
        int second = lastOccurence(nums, target, n);
        ans[0] = first;
        ans[1] = second;
        return ans;
    }

    static int firstOccurence(int[] arr, int x, int n) {
        int cnt = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                cnt = mid;
                high = mid - 1;  // Move left
            } else if (x > arr[mid]) {
                low = mid + 1;   // Go right
            } else {
                high = mid - 1;  // Go left
            }
        }
        return cnt;
    }

    static int lastOccurence(int[] arr, int x, int n) {
        int cnt = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                cnt = mid;
                low = mid + 1;  // Move right
            } else if (x > arr[mid]) {
                low = mid + 1;  // Go right
            } else {
                high = mid - 1; // Go left
            }
        }
        return cnt;
    }
}