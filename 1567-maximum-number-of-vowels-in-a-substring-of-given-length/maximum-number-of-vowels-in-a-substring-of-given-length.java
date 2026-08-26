class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i =0;
        int j =0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j<n){
            char ch = s.charAt(j);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
            if(j-i+1 < k){
               j++;
            }
            else{
                max = Math.max(count,max);
                char ch1 = s.charAt(i);
                if(ch1 == 'a'||ch1 == 'e'||ch1 == 'i'||ch1 == 'o'||ch1 == 'u'){
                    count--;
                }
                    i++;
                    j++;
            }
        }
        return max;
    }
}