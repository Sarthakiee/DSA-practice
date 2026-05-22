class Solution {
    public int majorityElement(int[] nums) {
      
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
           mpp.put(num,mpp.getOrDefault(num,0) + 1);
            if(mpp.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}