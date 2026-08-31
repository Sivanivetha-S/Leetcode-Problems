class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>list = new HashMap<>();
        int n = strs.length;
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String val = String.valueOf(ch);
            if(!list.containsKey(val)){
                list.put(val,new ArrayList<>());
            }
            list.get(val).add(str);
        }
        return new ArrayList<>(list.values());
    }
}