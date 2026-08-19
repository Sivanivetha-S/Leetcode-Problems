class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character>list = new ArrayList<>();
        int n = s.length();
        int max = 0;
        int size = 0;
        for(int i = 0;i<n;i++){
           char temp = s.charAt(i);
            while (list.contains(temp)) {
                list.remove(0);
            }
                list.add(temp);
            max = Math.max(max, list.size());
        }
        return max;
    }
}