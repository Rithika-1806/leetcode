class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && Math.abs(nums[i]-nums[j])==k){
                int a=Math.min(nums[i],nums[j]);
                int b=Math.max(nums[i],nums[j]);    
                set.add(a+","+b);
                }
            }
        }
        return set.size();
    }
}