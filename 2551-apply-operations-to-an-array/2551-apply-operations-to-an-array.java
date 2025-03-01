class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i + 1] && nums[i] != 0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int nonZeroIndex = 0;
        for (int j = 0; j < n; j++) {
            if(nums[j] != 0) {
                nums[nonZeroIndex++] = nums[j];
            }
        }

        while (nonZeroIndex < n) {
            nums[nonZeroIndex++] = 0;
        }

        return nums;
    }   
}