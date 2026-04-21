class Solution {
    public int reverseBits(int n) {
         String bin = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
         String rev = new StringBuilder(bin).reverse().toString();
         long val = Long.parseLong(rev,2);
         return (int) val;
    }
}