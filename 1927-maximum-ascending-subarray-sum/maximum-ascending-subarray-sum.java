class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int curVal = nums[0], 
            maxVal = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                curVal += nums[i];
            }
            else{
                maxVal = Math.max(maxVal, curVal);
                curVal = nums[i];
            }
        }
        return Math.max(maxVal, curVal);

    }
}