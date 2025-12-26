class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        map1.put(s.charAt(0), t.charAt(0));
        map2.put(t.charAt(0), s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                if (map1.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                map1.put(s.charAt(i), t.charAt(i));
            }
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i))
                    return false;
            } else {
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}