class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)<=k){
                list.add(num);
            }
        
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}