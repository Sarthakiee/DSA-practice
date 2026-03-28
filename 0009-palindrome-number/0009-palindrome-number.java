class Solution {
    public boolean isPalindrome(int x) {
                
       if(x<0){
          return false;
       }

    int org = x;
    int a = 0;

    while(x>0){
        int rem = x % 10;
        x = x/10;

        a = a * 10 + rem ;
    }

    return a == org;
    

    }
}

