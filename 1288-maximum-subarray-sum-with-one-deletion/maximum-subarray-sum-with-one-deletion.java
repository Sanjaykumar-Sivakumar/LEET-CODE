class Solution {
    public int maximumSum(int[] arr) 
    {
        int preND = arr[0];
        int preWD = arr[0];
        int max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            preWD = Math.max(preWD + arr[i], preND);
            preND = Math.max(preND + arr[i],arr[i]);
            max = Math.max(max, Math.max(preND, preWD));
        }
        return max;
    }
}