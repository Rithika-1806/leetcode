class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum=0;
            int temp=n;
            while(temp>0){
                int digit=temp%10;
                int sq=digit*digit;
                sum+=sq;
                temp=temp/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}