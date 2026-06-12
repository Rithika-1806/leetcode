class Solution {
    public int hardestWorker(int p, int[][] logs) {
        int max=logs[0][1];
        int idx=logs[0][0];
        for(int i=1;i<logs.length;i++){
            int num=logs[i][1] - logs[i-1][1];
            if(num>max){
                max=num;
                idx=logs[i][0];
            }
            else if(max==num){
                idx=Math.min(idx,logs[i][0]);
            }

        }
        return idx;
    }
}