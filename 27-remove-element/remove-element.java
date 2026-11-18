class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>list = new ArrayList<>();
        int i =0;
        int j= 0;
        for(int num : nums){
            if(num != val){
                list.add(num);
                j++;
            }
        }
        for(int num: list){
            nums[i++] = num;
        }
        return i;
    }
}