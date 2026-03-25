class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(mpp.keySet());
        Collections.sort(list,(a,b)-> mpp.get(b) - mpp.get(a));

        int [] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}