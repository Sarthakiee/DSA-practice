class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxA = 0;

        while(l<r){
            int len = Math.min(height[l],height[r]);
           int w = r - l;
            int area = len * w;
            maxA = Math.max(maxA,area);
          
           if(height[l]<height[r]){
            l++;
           } else{
            r--;
        }
    }
    return maxA;
  }
}