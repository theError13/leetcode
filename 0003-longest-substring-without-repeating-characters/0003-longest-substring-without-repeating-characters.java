import java.util.Set;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();
        int right = 0, maxLength = 0;
        Set<Character> check = new HashSet<>();
        for (int left = 0; left < s.length(); left++) {
            while (right != s.length() && !check.contains(s.charAt(right))) {
                maxLength = Math.max(maxLength, right - left + 1);
                check.add(s.charAt(right));
                right++;
            }
            check.remove(s.charAt(left));
        }
        return maxLength;
    }
}