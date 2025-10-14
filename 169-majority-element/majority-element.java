class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == majority)
            {
                count++;
            }
            else count--;
            if(count == 0 && majority != nums[i])
            {
                count = 1;
                majority = nums[i];
            }
        }
        return majority;
    }
}