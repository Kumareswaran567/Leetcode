class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int gcd = 0;
        for(int i=1;i<=max;i++){
            if(min%i==0 && max%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}