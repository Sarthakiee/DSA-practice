class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String word : words){
            int s = 0;
            for (char ch : word.toCharArray()){
                s+=weights[ch - 'a'];
            }
            int m = s%26;

            char mapCh = (char) ('z' - m);
            res.append(mapCh);
        }
        return res.toString();
        
    }
}