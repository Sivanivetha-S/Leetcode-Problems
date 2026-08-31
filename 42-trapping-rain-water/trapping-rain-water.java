class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] left_max = new int[n];
        int[] right_max = new int[n];
        left_max[0] = arr[0];
        right_max[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            left_max[i] = Math.max(left_max[i-1],arr[i]);
            right_max[n-i-1] = Math.max(right_max[n-i],arr[n-i-1]);
        }
        int ans =0;
        for(int i =0;i<n;i++){
            ans += Math.min(left_max[i],right_max[i]) - arr[i];
        }
        return ans;
    }
}