class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int sL = -1;
         
         for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int temp = ch - '0';

                if(temp>largest){
                    sL = largest;
                    largest = temp;
                }
                else if(temp>sL && temp<largest){
                    sL = temp;
                }
            }
         }


         return sL;
    }
}
