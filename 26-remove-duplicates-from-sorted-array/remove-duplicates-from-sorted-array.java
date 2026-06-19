//Using Two Pointer Approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(int j = 1;j<n;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[++i] = nums[j];
            }
        }
        return ++i;
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