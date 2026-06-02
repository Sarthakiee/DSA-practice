class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(i < m && j < n){
            if(g[i]<=s[j]){
                i++;
            }

            j++;
        }

        return i;
    }
}