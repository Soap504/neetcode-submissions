class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //set up hashmap k , v
        HashMap<Character, Integer> sCharMap = new HashMap<>();

        HashMap<Character, Integer> tCharMap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            tCharMap.put(t.charAt(i), tCharMap.getOrDefault(t.charAt(i), 0) + 1);
            sCharMap.put(s.charAt(i), sCharMap.getOrDefault(s.charAt(i), 0) + 1);
        }


        

        return sCharMap.equals(tCharMap);
    }
}
