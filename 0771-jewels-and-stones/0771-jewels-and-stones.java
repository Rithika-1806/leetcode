class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            list.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            if(list.contains(stones.charAt(i))){
                count++;
        }
        }
        return count;
    }
}