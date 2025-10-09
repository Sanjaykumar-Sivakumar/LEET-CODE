class Solution {
    public int singleNumber(int[] nums) {
        //XOR Approach (Best solution — O(n) time, O(1) space)
        int ans = 0;
        for(int i : nums)
        {
            ans ^= i;
        }
        return ans;
        //Set Based Approach (O(n) time, O(n) space)
        // Set<Integer> s = new HashSet<>();
        // for(int n : nums)
        // {
        //     if(s.contains(n))
        //     {
        //         s.remove(n);
        //     }
        //     else
        //     {
        //         s.add(n);
        //     }
        // }
        // for(int a : s)
        // {
        //     return a;
        // }
        // return -1;
    }
}