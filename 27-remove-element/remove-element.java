class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        int i = 0;
        int count = 0;
        for(int num : nums){
            if(num != val){
                nums[i++] = num;
            }
        }
        return i;
    }
}