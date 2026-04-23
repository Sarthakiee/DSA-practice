class Solution {
    public String reverseVowels(String s) {
        char [] c = s.toCharArray();

        int l = 0;
        int r = c.length - 1;

        while(l<r){
            while(l<r && !isVowel(c[l])) l++;
            while(l<r && !isVowel(c[r])) r--;

            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;

            l++;
            r--;
        }

        return new String(c);
    }
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}