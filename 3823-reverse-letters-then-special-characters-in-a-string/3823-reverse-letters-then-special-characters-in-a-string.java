class Solution {
    public String reverseByType(String s) {
        
        char ch[]=s.toCharArray();
        StringBuilder letter=new StringBuilder();
        StringBuilder special=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                letter.append(ch[i]);
            }
            else{
                special.append(ch[i]);
            }
        }
        letter.reverse();
        special.reverse();
        int l=0;
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=letter.charAt(l++);
            }
            else{
                ch[i]=special.charAt(j++);
            }
        }
        return String.valueOf(ch);
    }
}