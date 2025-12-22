class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber != 0) {
            char newChar;
            if (columnNumber % 26 != 0) {
                newChar = (char) ('@' + (columnNumber % 26));
            } else {
                newChar = 'Z';
                columnNumber = columnNumber - 1;
            }
            ans = newChar + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
}