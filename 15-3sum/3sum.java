class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set = new HashSet<>();
        int n = nums.length;
        int i = 0;
        int j = i+1;
        int k = n-1;
        Arrays.sort(nums);
        while(i < n-2){
            while(j < k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer>list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
                i++;
                while(i < n-2 && nums[i] == nums[i-1]){
                    i++;
                }
                j = i+1;
                k = n-1;
        }
        return new ArrayList<>(set);
    }
}