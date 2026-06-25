class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        String word1[]=s1.split(" ");
        String word2[]=s2.split(" ");
        for(String word:word1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:word2){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        List<String>list=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        String res[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}