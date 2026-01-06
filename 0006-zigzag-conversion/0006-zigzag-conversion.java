class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder("");
        }
        for (int j = 0; j < s.length(); j++) {
            if (j % ((numRows - 1) * 2) > numRows - 1) {
                rows[2 * (numRows - 1) - (j % ((numRows - 1) * 2))].append(s.charAt(j));
            } else {
                rows[j % ((numRows - 1) * 2)].append(s.charAt(j));
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }
        return result.toString();
    }
}