class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        //char[] ch = str.toCharArray();
        String x = "";
        String y = "";
        int n = str.length();
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                x = x + ch;
                y = ch + y;
            }
        }
        if(x.equals(y)){
            return true;
        }
        else{
            return false;
        }
    }
}