class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
    int[] range1 = Arrays.copyOfRange(nums, 1, nums.length);
    int[] range2 = Arrays.copyOfRange(nums, 0, nums.length-1);

        int result1 = robHelper(range1);
         int result2 = robHelper(range2);
      int ans = Math.max(result1,result2);
      return ans;
    }
    public int robHelper(int[] nums){
         int x = 0, y = 0;
        for(int n : nums){
            int temp = Math.max(n+x, y);
            x = y;
            y = temp;
           
        }
        return y;
    }
}