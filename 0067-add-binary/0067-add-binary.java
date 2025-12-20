class Solution {
    public int change(char x) {
        if (x=='1') {
            return 1;
        } else {
            return 0;
        }
    }

    public String addBinary(String a, String b) {
        boolean carry = false;
        int aS = a.length() - 1;
        int bS = b.length() - 1;
        String ans = "";
        while (aS >= 0 || bS >= 0 || carry) {
            int sum = 0;
            if (aS != -1) {
                sum = sum + change(a.charAt(aS));
                aS--;
            }
            if (bS != -1) {
                sum = sum + change(b.charAt(bS));
                bS--;
            }
            if (carry) {
                sum = sum + 1;
                carry = false;
            }
            if (sum > 1)
                carry = true;
            if (sum % 2 == 0) {
                ans = "0" + ans;
            } else {
                ans = "1" + ans;
            }
        }
        return ans;
    }
}