class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list2=new ArrayList<>();
       
        for(int x:nums2){
            list2.add(x);
        }
        List<Integer> result=new ArrayList<>();
        for(int x:nums1){
            if(list2.contains(x)){
                result.add(x);
                list2.remove(Integer.valueOf(x));
            }
        }
        int temp[]=new int[result.size()];
        for(int i=0;i<result.size();i++){
            temp[i]=result.get(i);
        }
        return temp;
    }
}