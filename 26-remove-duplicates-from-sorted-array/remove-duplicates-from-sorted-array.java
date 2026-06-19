class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
//         if(nums.length==0) return 0;

//         int j =0;
//         for(int i =0;i<nums.length;i++){
//             if(nums[i]!=nums[j]){
//                 nums[++j]=nums[i];
//             }
//         }
        
//     return ++j;
//     }
// }