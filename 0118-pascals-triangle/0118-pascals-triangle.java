class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    row.add(1);
                } else {
                    row.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }
            pascal.add(new ArrayList<>(row));
            row.removeAll(row);
        }
        return pascal;
    }
}