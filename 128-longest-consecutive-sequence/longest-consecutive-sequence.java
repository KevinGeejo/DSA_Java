class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1 || nums.length==0){
            return nums.length;
        }

        HashSet<Integer> set =new HashSet<>();

        int count = 1;
        int ans = 1;
        for(int i =0; i<nums.length;i++){
            set.add(nums[i]);
        }

        for(Integer it : set){
            if(set.contains(it - 1)){
                continue;
            }

            int nextVal = it + 1;

            if(set.contains(nextVal)){
                count = 1;
                while(set.contains(nextVal)){
                    count++;
                    nextVal++;
                }

                ans = Math.max(ans, count);
            }
            else{
                count = 1;
            }
        }
        return ans;
    }
}