class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int j=0;
        char arr[] = stones.toCharArray();
        for(char c : arr){
            if(jewels.contains(c+"")){
                j++;
            }
        }
        return j;
    }
}