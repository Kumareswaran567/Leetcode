class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if(!haystack.contains(needle)){
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,needle.length()+i).contains(needle)){
                index = i;
                break;
            }
        }
        return index;
    }
}