class Solution {
    public int waysToMakeFair(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even+=nums[i];
            }
            else{
                odd+=nums[i];
            }
        }
        int count=0;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even=even-nums[i]+prev;
            }
            else{
                odd=odd-nums[i]+prev;
            }
            if(even==odd){
                count++;
            }
            prev=nums[i];
        }
        return count;
    }
}