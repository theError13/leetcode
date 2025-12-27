class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int ans=0;
        for (int i = 0; i < t.length(); i++) {
            ans = ans ^ tArray[i];
        }
        for (int i = 0; i < s.length(); i++) {
            ans = ans ^ sArray[i];
        }
        return (char)ans;
    }
}