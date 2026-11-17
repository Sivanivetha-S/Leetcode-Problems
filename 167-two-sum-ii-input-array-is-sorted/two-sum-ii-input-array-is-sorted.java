class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        int r = 0;
        int l = n-1;
        while(r<l){
            if(num[r]+num[l] == target){
                return new int[]{r+1,l+1};
            }
            else if(num[r]+num[l] > target){
                l--;
            }
            else{
                r++;
            }
        }
        return new int[]{0,0};
    }
}