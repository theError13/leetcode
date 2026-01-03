class Solution {
    public String longestPalindrome(String s) {
        int oddL = 0, oddR = 0, evenL = 0, evenR = 0, max = 1, left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            evenL = i;
            evenR = i + 1;
            while (evenL >= 0 && evenR < s.length() && s.charAt(evenL) == s.charAt(evenR)) {
                evenR++;
                evenL--;
            }
            oddL = i;
            oddR = i;
            while (oddL >= 0 && oddR < s.length() && s.charAt(oddR) == s.charAt(oddL)) {
                oddR++;
                oddL--;
            }
                if (evenR - evenL - 1 > max) {
                    max = evenR - evenL - 1;
                    left = evenL + 1;
                    right = evenR - 1;
                }
                if (oddR - oddL - 1 > max) {
                    max = oddR - oddL - 1;
                    left = oddL + 1;
                    right = oddR - 1;
                }

        }
        return s.substring(left, right + 1);
    }
}