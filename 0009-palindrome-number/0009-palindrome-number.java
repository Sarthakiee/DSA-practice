class Solution {
    public boolean isPalindrome(int x) {
                
        if(x<0 || x%10==0 && x!=0){
           return false;
        }
        
     int original = x;
     int ans = 0;
        while (x>0){
            int rem= x%10;
            x/=10;

            ans = ans * 10 + rem ;
           
        }


        return original == ans ;

    

    }
}

