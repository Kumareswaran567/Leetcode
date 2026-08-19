class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        sum(0,candidates,target,data,answer);
        return data;
    }
    public void sum(int start,int[]arr,int target,List<List<Integer>> data,List<Integer> answer){
        if(target==0){
            data.add(new ArrayList<>(answer));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(arr[i]>target){
                continue;
            }
            answer.add(arr[i]);
            sum(i,arr,target-arr[i],data,answer);
            answer.remove(answer.size()-1);
        }
        
    }
}