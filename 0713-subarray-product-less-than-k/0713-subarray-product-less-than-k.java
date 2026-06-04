class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int start=0;
        int count=0;
        int prod=1;
        if(k<=1) return 0;
        for(int end=0;end<arr.length;end++){
            
            prod*=arr[end];
            while(prod>=k){
                prod/=arr[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}