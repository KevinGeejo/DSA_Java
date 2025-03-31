class Solution {
    public int rob(int[] nums) {
        int x = 0, y = 0;
        for(int n : nums){
            int temp = Math.max(n+x, y);
            x = y;
            y = temp;
           
        }
        return y;
    }
}