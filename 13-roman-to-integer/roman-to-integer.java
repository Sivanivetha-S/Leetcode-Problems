class Solution {
    public int romanToInt(String s) {
        int ans =0;
        int cur =0;
        int res = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'I') cur = 1;
            else if(ch == 'V') cur = 5;
            else if(ch == 'X') cur = 10;
            else if(ch == 'L') cur = 50;
            else if(ch == 'C') cur = 100;
            else if(ch == 'D') cur = 500;
            else{
                cur = 1000;
            }
            if(i+1 < s.length()){
                char nch = s.charAt(i+1);
            if(nch == 'I') ans = 1;
            else if(nch == 'V') ans = 5;
            else if(nch == 'X') ans = 10;
            else if(nch == 'L') ans = 50;
            else if(nch == 'C') ans = 100;
            else if(nch == 'D') ans = 500;
            else{
                ans = 1000;
            }
            }
            if(ans <= cur){
                res += cur;
            }
            else{
                res -= cur;
            }
        }
        return res;
    }
}