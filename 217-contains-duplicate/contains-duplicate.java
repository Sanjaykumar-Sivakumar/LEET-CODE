class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> s = new HashSet<>();
        for(int n : nums)
        {
            if(s.contains(n))
            {
                return true;
            }
            s.add(n);
        }
        return false;
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length - 1;i++)
        // {
        //     if(nums[i] == nums[i + 1])
        //     {
        //         return true;
        //     }
        // }
        // return false;
    }
}