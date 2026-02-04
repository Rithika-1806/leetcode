class Solution {
    public String convertToTitle(int n) {
        String s="";
        while(n>0){
            n--;
            char ch=(char)('A'+(n%26));
            s=ch+s;
            n=n/26;
        }
        return s;

    }
}