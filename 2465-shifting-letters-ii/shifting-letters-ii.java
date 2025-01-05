class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
         int n = s.length();
        int[] diff = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            int change = direction == 1 ? 1 : -1;
            diff[start] += change;
            diff[end + 1] -= change;
        }

        int[] shiftAmount = new int[n];
        shiftAmount[0] = diff[0];
        for (int i = 1; i < n; i++) {
            shiftAmount[i] = shiftAmount[i - 1] + diff[i];
        }

        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int newChar = ((result[i] - 'a' + shiftAmount[i]) % 26 + 26) % 26 + 'a';
            result[i] = (char) newChar;
        }

        return new String(result);
    }
}