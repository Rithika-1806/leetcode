class Solution {
    public int maxDepth(String s) {
        int p=0;
        int ans=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                p++;
            }
            else if(ch[i]==')'){
                p--;
            }
            ans=Math.max(ans,p);
        }
        return ans;
    }
}