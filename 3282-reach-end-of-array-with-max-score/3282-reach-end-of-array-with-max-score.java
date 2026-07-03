class Solution {
    public long findMaximumScore(List<Integer> nums) {
        int max=0;
        long res=0;
        for(int num:nums){
            res+=max;
            max=Math.max(max,num);
        }
        return res;
    }
}