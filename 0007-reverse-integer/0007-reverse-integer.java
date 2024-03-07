class Solution {
    public int reverse(int x) {
        int temp = x;
        long reverse = 0;
        
        while(temp!=0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if(reverse == (int) reverse){
            return (int) reverse;
        }else{
            return 0;
        }
    }
}