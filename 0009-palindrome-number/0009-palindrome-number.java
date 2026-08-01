class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int x2 = x;
        int reverse = 0;
        while(x>0){
            int dig = x % 10;
            reverse = reverse * 10 + dig;
            x = x /10;

        }

        return x2 == reverse;
    }
}