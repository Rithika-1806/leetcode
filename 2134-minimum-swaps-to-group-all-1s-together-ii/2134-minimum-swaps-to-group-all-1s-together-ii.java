class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int k=0;
        int arr[]=new int[n*2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }
            arr[i]=nums[i];
        }
        
        for(int i=n;i<arr.length;i++){
            arr[i]=nums[i-n];
        }
        int start=0;
        int count=0;
        int max=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]==1){
                count++;
            }
            if(end-start+1>k){
                if(arr[start]==1)
                    count--;
                start++;
            }
            if(end-start+1==k){
                max=Math.max(max,count);
            }
        }
        return k-max;
    }
}