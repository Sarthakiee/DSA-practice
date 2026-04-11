class Solution {
    public int minimumDistance(int[] nums) {
        int [] norvalent = nums;
   Map<Integer, List<Integer>> positions = new HashMap<>();

    for( int i = 0 ; i <norvalent.length; i++){
        positions.computeIfAbsent(norvalent[i],k -> new ArrayList<>()).add(i);
    }

        int minDis = Integer.MAX_VALUE;

        for(List<Integer> list : positions.values()){
            if(list.size() >= 3){
                for( int i = 0 ; i + 2 < list.size(); i++){
                    int dis = 2 *(list.get(i + 2) - list.get(i));

                    minDis = Math.min(minDis,dis);
                }
            }
        }
        return (minDis == Integer.MAX_VALUE) ? -1 : minDis;
    }
}