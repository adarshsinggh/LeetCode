class Solution {
    public int minPartitions(String n) {
        if(n.length() == 0){
            return 0;
        }
        int maxDigit = 0;
        if(n.length() ==1){
            maxDigit = Integer.parseInt(n.charAt(0)+"");
        }
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            int dig = Integer.parseInt(ch+"");
            maxDigit = Math.max(maxDigit,dig);
        }
        return maxDigit;
    }
}