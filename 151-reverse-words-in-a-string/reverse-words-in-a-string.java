class Solution {
    public String reverseWords(String s) {
        
       String[] str = s.trim().split("\\s+");
       int n =str.length;
       String[] ans = new String[n];
       int j =0;
       for(int i=n-1;i>=0;i--){
            ans[j] = str[i];
            j++;
       }
       return String.join(" ", ans);
    }
}