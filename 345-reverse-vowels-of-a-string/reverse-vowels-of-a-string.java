class Solution {
    public static boolean isVowel(char ch){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                return true;
            }
            return false;
        }
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isVowel(ch[left])){
                left++;
            }
            while(left<right && !isVowel(ch[right])){
                right--;
            }
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}