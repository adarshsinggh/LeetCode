class Solution {
   public int countPrimes(int n) {
        if(n<=1) return 0; 

        boolean[] a = new boolean[n];
        Arrays.fill(a, true);
        a[0] = a[1] = false;
        int cnt = 1;

        for(int i=2; i<Math.sqrt(n); i++){
            if(a[i]){
                for(int j=i*i; j<n; j+=i){
                    if(a[j]) cnt++;
                    a[j] = false;
                }
            }
        }

        return n-cnt-1;
    }
}