class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
        int i =0;
        int j =1;
        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count+1;
    }
}