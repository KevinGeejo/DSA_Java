class Solution {

    public boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    public int[] vowelStrings(String[] words, int[][] queries) {
         int[] prefixSum = new int[words.length + 1];
        
    
        
        for (int i = 0; i < words.length; ++i) {
            // Check if the word starts and ends with a vowel
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefixSum[i + 1] = 1 + prefixSum[i];
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }
        
        int[] res = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int count = prefixSum[queries[i][1] + 1] - prefixSum[queries[i][0]];
            res[i] = count;
        }
        
        return res;

        }
    }
