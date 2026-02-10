class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list2=new ArrayList<>();
        for(char x:t.toCharArray()){
            list2.add(x);
        }

        for(char x:s.toCharArray()){
            list2.remove(Character.valueOf(x));
        }
        return list2.get(0);
    }
}