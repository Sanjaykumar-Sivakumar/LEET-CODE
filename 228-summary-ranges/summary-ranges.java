class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        int i = 0;
        while(i<nums.length)
        {
             int st = nums[i];
        while(i + 1 <nums.length && nums[i + 1] == nums[i] + 1)
        {
           
            i++;
        }
        int ed = nums[i];
        if(st == ed) res.add(String.valueOf(st));
        else
        {
             res.add(st + "->" + ed);
        }
        i++;
        }
        return res;
    }
}