class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        int count1=0;
        int count2 =0;
        for(int num : nums){
            if(num != 0){
                list.add(num);
                count1++;
            }
            else{
                count2++;
            }
        }
        int i=0;
        for(int num :list){
            nums[i++] = num;
        }
        while(count2>0){
            nums[i++] = 0;
            count2--;
        }
        return;
    }
}