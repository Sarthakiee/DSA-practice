class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int count = 0;
        if(n == 0){
            return true;
        }
        for(int i =0; i < l; i++){
            if(flowerbed[i]==0){
                int left = (i == 0) ? 0 : flowerbed[i - 1];
                int right = (i == l - 1) ? 0 : flowerbed[i+1];

                if(left == 0 && right == 0){
                    flowerbed[i] = 1;
                    count++;
                    if(count>=n){
                        return true;
                    }
                } 
            }
        }
        return count>=n;
    }
}