class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size()<3){
        return list.get(list.size()-1);
        }
        return list.get(list.size()-3);
    }
}