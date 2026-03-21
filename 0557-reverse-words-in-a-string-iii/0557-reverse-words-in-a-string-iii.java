class Solution {
    public String reverseWords(String s) {
           

        String [] words = s.split(" ");

        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i<words.length; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            res.append(temp.reverse());
            if( i!=words.length -1){
                res.append(" ");
            }
        }

       return res.toString();
        
    }
}