class Solution {
    public int climbStairs(int n) {
        int f1=0,f2=1;
        for(int i=0;i<n;i++){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f2;
    }
}