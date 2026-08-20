class Solution {
    public int uniquePaths(int m, int n) {
       int[][] sum = new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0){
                sum[i][j]=1;
            }
            else{
                    sum[i][j] = sum[i-1][j]+sum[i][j-1];
            }
        }
       }
       return sum[m-1][n-1];
    }
}