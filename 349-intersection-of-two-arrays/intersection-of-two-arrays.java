class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int x:nums1){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        for(int x:nums2){
            if(!list2.contains(x)){
                list2.add(x);
            }
        }
        

        List<Integer> result=new ArrayList<>();
        
        for(int x:list){
            if(list2.contains(x)){
                result.add(x);
            }
        }
        int temp[]=new int[result.size()];
        for(int i=0;i<result.size();i++){
            temp[i]=result.get(i);
        }
        return temp;

    }
}