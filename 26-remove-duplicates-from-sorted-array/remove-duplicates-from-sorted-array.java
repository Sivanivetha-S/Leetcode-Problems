class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer>map = new LinkedHashSet<>();
       for(int num : nums){
        map.add(num);
       }
       int index = 0;
       for(int num : map){
        nums[index++] = num;
       }
       return index;
    }
}