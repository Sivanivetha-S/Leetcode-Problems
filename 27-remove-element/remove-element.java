class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while(i<=j){
            if(nums[i] != val){
                i++;
                count++;
            }
            else if(nums[j] == val){
                j--;
            }
            else{
                //int temp = nums
                nums[i] = nums[j];
                i++;
                j--;
                count++;
            }
        }
        return count;
    }
}