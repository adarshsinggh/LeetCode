class Solution {
    public boolean checkPossibility(int[] nums) {
        
        
        for(int i=1,mod=0,prev=nums[0];i<nums.length;i++){
            if(nums[i]<prev){
                if(mod++ ==1){
                    return false;
                }
                if(i>=2&&nums[i-2]>nums[i]){
                    continue;
                }
            }
            prev = nums[i];
        }
        return true;
    }
}