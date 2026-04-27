class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int bin = 0;
        for( int x : nums){
            bin |= x;
        }

        int ans = bin * (1 << (n - 1));
        return ans;
    }
}