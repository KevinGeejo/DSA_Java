class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashSet<String> uniquePalindromes = new HashSet<>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);
            
            if (left != -1 && right != -1 && left < right) {
                for (int i = left + 1; i < right; i++) {
                    uniquePalindromes.add("" + c + s.charAt(i) + c);
                }
            }
        }
        
        return uniquePalindromes.size();
    }
}