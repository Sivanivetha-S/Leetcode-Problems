class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int s=0;
        int temp[] = new int[n+m];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[s++] = nums1[i];
                i++;
            }
            else{
                temp[s++] = nums2[j];
                j++;
            }
        }
        while(i < m){
            temp[s++] = nums1[i++];
        }
        while(j < n){
            temp[s++] = nums2[j++];
        }
        int e = 0;
        for(int num : temp){
            nums1[e++] = num;
        }
    }
}