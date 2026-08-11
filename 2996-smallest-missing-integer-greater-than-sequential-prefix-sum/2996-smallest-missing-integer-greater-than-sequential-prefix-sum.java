class Solution {
    public int missingInteger(int[] nums) {
        int add = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                add+=nums[i];
            }else{
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(add==nums[i]){
                add++;
                i = 0;
            }
        }
        return add;
    }
}