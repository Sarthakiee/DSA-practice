class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()){
            set.add(ch);
        }
        int cnt = 0;

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(set.contains(ch)&&set.contains(Character.toUpperCase(ch))){
                cnt++;
            }
        }
        return cnt;
    }
}