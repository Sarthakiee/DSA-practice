class Solution {
    public int mirrorDistance(int n) {
        int reversed = 0;
        int n1 = n; 
        while(n1>0){
            int digit = n1 % 10;
            reversed = reversed * 10 + digit;
            n1 = n1/10;
        }
        int t = n - reversed;
        int k = Math.abs(t);
        return k;
    }
}