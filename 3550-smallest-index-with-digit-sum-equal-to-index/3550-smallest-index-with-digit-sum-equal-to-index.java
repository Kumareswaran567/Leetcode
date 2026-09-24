class Solution {
    public int smallestIndex(int[] nums) {
        int small = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int add = 0;
            while(num>0){
                add=add+(num%10);
                num = num/10;
            }
            if(add==i && add<small){
                small = add;
            }
        }
        return (small==Integer.MAX_VALUE)?-1:small;
    }
}