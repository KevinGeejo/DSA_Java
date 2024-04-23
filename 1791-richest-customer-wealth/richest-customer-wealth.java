class Solution {
    public int maximumWealth(int[][] accounts) {
        int currentSum = 0;
        int maxSum = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[0].length; j++){
                currentSum += accounts[i][j];
            }
            maxSum = Math.max(currentSum, maxSum);
            currentSum =0;
        }
        return maxSum;
    }
}