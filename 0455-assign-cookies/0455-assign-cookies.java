class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); 
        Arrays.sort(s); 
        int gc = 0;
        int sc = 0;
        int count = 0;
        while (gc != g.length && sc != s.length) {
            if (s[sc] >= g[gc]) {
               count++;
               gc++;
            }
            sc++;
        }
        return count;
    }
}