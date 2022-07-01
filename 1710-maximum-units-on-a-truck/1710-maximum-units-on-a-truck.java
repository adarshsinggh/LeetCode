class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> {
            return b[1]-a[1];
        });
        
        int maximum = 0;
        int leftSize = truckSize;
        
        for(int[] boxType : boxTypes){
            if(leftSize >= boxType[0]){
                maximum += boxType[0]*boxType[1];
                leftSize -= boxType[0];
            }else{
                maximum += leftSize * boxType[1];
                break;
            }
        }
        return maximum;
    }
}