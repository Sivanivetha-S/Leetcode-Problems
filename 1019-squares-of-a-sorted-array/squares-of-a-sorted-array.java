class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = n-1;
        int j = n -1;
        int i = 0;
        while(i <= j){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                temp[k] = nums[i]*nums[i];
                k--;
                i++;
            }
            else{
                temp[k] = nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return temp;
    }
}