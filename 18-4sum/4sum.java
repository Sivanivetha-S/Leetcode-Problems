class Solution {
    public List<List<Integer>> fourSum(int[] nums, int tar) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-3;i++){
           if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for(int j = i+1;j<nums.length-2;j++)
            {
            if(j > i+1 && nums[j] == nums[j-1])
            continue;

            int k = j+1;
            int l = nums.length -1;
            long sum;
            while(k<l){
                sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                if(sum == tar){
                    ArrayList<Integer>list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[l]);
                    ans.add(list);
                    l--;
                    k++;
                    while(k<l && nums[l+1] == nums[l]){
                    l--;
                    }
                    while(k<l && nums[k-1] == nums[k]){
                    k++;
                    }
                }
                else if(sum < tar){
                    k++;
                }
                else{
                    l--;
                }
            }
            }
        }
        return ans;
    }
}