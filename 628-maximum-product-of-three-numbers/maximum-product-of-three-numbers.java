class Solution {
    public int maximumProduct(int[] nums) {
        int min = 1000;
        int smin = min;
        int max = -1000;
        int smax = max;
        int tmax = max;
        for(int i =0;i<nums.length;i++){
            if(nums[i] < min){
                smin = min;
                min = nums[i];
            }
            else if(nums[i] < smin){
                smin = nums[i];
            }
            if(nums[i] > max){
                tmax = smax;
                smax = max;
                max = nums[i];
            }
            else if(nums[i] > smax){
                tmax = smax;
                smax = nums[i];
            }
            else if(nums[i] > tmax){
                tmax = nums[i];
            }
        }
        int ans1 = max*smax*tmax;
        int ans2 = min*smin*max;
        return Math.max(ans1,ans2); 
    }
}