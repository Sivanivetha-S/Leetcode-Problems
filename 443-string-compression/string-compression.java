class Solution {
    public int compress(char[] chars) {
        int i =0;
        int j =0;
        while(i<chars.length){
            int count = 0;
            char ch = chars[i];
            while(i<chars.length && chars[i] == ch){
                count ++;
                i++;
            }
            chars[j++] = ch;
            if(count > 1){
                String num = String.valueOf(count);
                for(char c : num.toCharArray()){
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
}