class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return  maxWealth;
    }
    
     
}