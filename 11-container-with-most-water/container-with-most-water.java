class Solution {
    public int maxArea(int[] arr) {
        int maxvalue = 0;
        int newvalue = 0;
        int n = arr.length;
        int i =0;
        int j =n-1;
        while(i <= j){
            if(arr[i] < arr[j]){
                newvalue = arr[i] *(j-i);
                maxvalue = Math.max(newvalue,maxvalue);
                i++;
            }
            else{
                newvalue = arr[j] *(j-i);
                maxvalue = Math.max(newvalue,maxvalue);
                j--;
            }
        }
        return maxvalue;
    }
}