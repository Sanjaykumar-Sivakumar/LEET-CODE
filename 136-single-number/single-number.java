class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums)
        {
            if(s.contains(n))
            {
                s.remove(n);
            }
            else
            {
                s.add(n);
            }
        }
        for(int a : s)
        {
            return a;
        }
        return -1;
    }
}