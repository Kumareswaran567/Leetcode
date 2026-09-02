class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0;
        int even = 0;
        int nums2[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        if(odd==0 || even==0){
            return true;
        }
        return true;
    }
}