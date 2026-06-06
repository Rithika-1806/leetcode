class Solution {
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int vowel=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
            if(i>=k){
                if(isVowel(s.charAt(i-k))){
                    vowel--;
                }
            }
            max=Math.max(max,vowel);
        }
        return max;
    }
}