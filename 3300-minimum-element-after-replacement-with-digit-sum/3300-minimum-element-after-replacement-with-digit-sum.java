class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            int curr = nums[i];

            while(curr>0){
                sum+=curr%10;
                curr = curr/10;
            }

            if(sum<ans){
                ans = sum;
            }
        }

        return ans;
    }
}