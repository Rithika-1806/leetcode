class Solution {
    public int secondHighest(String s) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int digit=s.charAt(i)-'0';
                if(!list.contains(digit)){
                    list.add(digit);
                }
            }
        }
       
        if(list.size()<2){
            return -1;
        }
         Collections.sort(list);
        return list.get(list.size()-2);
    }
}