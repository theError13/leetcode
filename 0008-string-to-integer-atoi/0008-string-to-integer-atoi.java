class Solution {
    public int myAtoi(String s) {
        if (s.trim().isEmpty())
            return 0;
        int count = 0;
        while (count != s.length() && s.charAt(count) == ' ') {
            count++;
        }
        boolean negaNum = false;
        if (s.charAt(count) == '-') {
            negaNum = true;
            count++;
        } else if (s.charAt(count) == '+') {
            count++;
        }
        if (count == s.length())
            return 0;
        int end = count;
        while (end != s.length() && Character.isDigit(s.charAt(end))) {
            end++;
        }
        String ans = s.substring(count, end);
        if (ans.isEmpty())
            return 0;
        int num;
        try {
            num = Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            if (negaNum) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        if (negaNum)
            num = num * (-1);
        return num;
    }
}