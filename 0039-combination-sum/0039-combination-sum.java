class Solution {
    
    private void comb(int index,int[] arr, int target,List<List<Integer>> ans,List<Integer> ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            comb(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size() - 1);
        }
        comb(index+1,arr,target,ans,ds);
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}