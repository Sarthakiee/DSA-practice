class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

     List<Map.Entry<Character, Integer>> list = new ArrayList<>(mpp.entrySet());
     list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }
        return result.toString();  
    }
}