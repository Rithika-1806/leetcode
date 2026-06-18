class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        int sum=0;
        String res="";
        for(int i=0;i<s.length();i++){
           int digit=s.charAt(i)-'0';
           if(digit!=0){
            res+=s.charAt(i);
            sum+=s.charAt(i)-'0';
           }
        }
        if(res.isEmpty()){
            return 0;
        }
        int num=Integer.parseInt(res);
        return (long) num*sum;
    }
}