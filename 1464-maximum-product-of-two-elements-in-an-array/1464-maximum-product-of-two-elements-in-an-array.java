class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length-1];
        int sec = nums[nums.length - 2];

        return (last - 1) * (sec - 1);
    }
}