class Solution {
    public String makeFancyString(String s) {
       StringBuilder resultBuilder = new StringBuilder();
        for (char currentChar : s.toCharArray()) {
            if (resultBuilder.length() >1 && 
                resultBuilder.charAt(resultBuilder.length() - 1) == currentChar && 
                resultBuilder.charAt(resultBuilder.length() - 2) == currentChar) {
            } else {
                resultBuilder.append(currentChar);
            }
        }
        return resultBuilder.toString(); 
    }
}