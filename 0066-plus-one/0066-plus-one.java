class Solution {
    public int[] plusOne(int[] digits) {
        boolean check = true;
        int len = digits.length - 1;
        while (check) {
            if (digits[len] + 1 > 9) {
                digits[len] = (digits[len] + 1) % 10;
                len = len - 1;
                if (len == -1) break;
                check = true;
            } else {
                digits[len] = digits[len] + 1;
                check = false;
            }
        }
        ;
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        } else {
            return digits;
        }
    }
}