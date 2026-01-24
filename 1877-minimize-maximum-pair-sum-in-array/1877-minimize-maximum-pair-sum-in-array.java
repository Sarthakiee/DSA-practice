class Solution {
  public int minPairSum(int[] nums) {
    Arrays.sort(nums);

    int maxS = 0;
    for (int i = 0; i < nums.length / 2; i++) {
      maxS = Math.max(maxS, nums[i] + nums[nums.length - 1 - i]);
    }

    return maxS;

  }
}