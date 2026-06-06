class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];

        int tot = 0;
        for(int x : nums){
            tot+=x;
        } 

        int left = 0;

        for(int i = 0; i < n; i++){
            int right = tot - left - nums[i];
            ans[i] = Math.abs(left - right);
            left+=nums[i];
        }

        return ans;
    }
}