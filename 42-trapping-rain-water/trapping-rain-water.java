class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
        {
            return 0;
        }

        int l= 0;
        int r = height.length - 1;
        int res = 0;
        int leftMax = height[l];
        int rightMax = height[r];

        while(l<r){
            if(leftMax < rightMax){
                l = l + 1;
                leftMax = Math.max(leftMax, height[l]);
                res = res + (leftMax - height[l]);
            }
            else{
                r = r -1;
                rightMax = Math.max(rightMax, height[r]);
                res = res+ ( rightMax - height[r]);
            }
        }

        return res;

    }
}