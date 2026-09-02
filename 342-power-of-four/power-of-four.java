class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if((n&n-1) != 0) return false;
        int p =0;
        if(n == 1) return true;
        while(n != 0){
            if((n&1) == 1 && p%2 == 0 && p!=0){
                return true;
            }
            n = n>>1;
            p++;
        }
        return false;
    }
}