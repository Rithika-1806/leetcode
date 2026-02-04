class Solution {

    public static boolean isPalin(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    String ans="";
    int max=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
                if(isPalin(ss)){
                    if(max<ss.length()){
                        max=ss.length();
                        ans=ss;
                    }
                }
            }
        }
        return ans;
    }
}