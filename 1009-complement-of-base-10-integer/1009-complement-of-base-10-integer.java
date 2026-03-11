class Solution {
    public int bitwiseComplement(int n) {

    String bin = Integer.toBinaryString(n);
    StringBuilder comp = new StringBuilder();

    for(int i = 0; i < bin.length(); i++){
        if(bin.charAt(i) == '0'){
            comp.append('1');
        } else {
            comp.append('0');
        }
    }

    int num = Integer.parseInt(comp.toString(), 2);
      return num;
    }
}