class Solution {
    public int missingNumber(int[] nums) {
        int in = nums.length;
        int sum = 0;
        for(int i = 0;i<in;i++)
        {
            sum += nums[i];
        }
        return in*(in + 1)/2 - sum;
    }
}