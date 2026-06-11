class Solution {
    public int minimumSwaps(int[] arr) {
       int nonZero=0;
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            nonZero++;
        }
       }
       for(int i=0;i<nonZero;i++){
        if(arr[i]==0){
            count++;
        }
       }
        
        return count;
    }
}