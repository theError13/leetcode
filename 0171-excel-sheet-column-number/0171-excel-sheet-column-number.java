class Solution {
    public int titleToNumber(String columnTitle) {
        StringBuilder stringBuilder = new StringBuilder(columnTitle);
        stringBuilder.reverse();
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans + (stringBuilder.charAt(i) - 'A' + 1) * (int)Math.pow(26, i);
        }
        return ans;
    }
}