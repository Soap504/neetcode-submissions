class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //set up hashmap k , v
        HashMap<Character, Integer> sCharMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCharMap.put(c, sCharMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(sCharMap);

          System.out.println();

        HashMap<Character, Integer> tCharMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tCharMap.put(ch, tCharMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(tCharMap);

        

        return sCharMap.equals(tCharMap);
    }
}
