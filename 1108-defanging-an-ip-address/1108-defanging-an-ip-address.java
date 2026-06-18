class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        String res="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                res+="[.]";
            }
            else{
                res+=address.charAt(i);
            }
        }
        return res;
    }
}