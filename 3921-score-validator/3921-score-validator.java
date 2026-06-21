class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int count=0;
        for(String event:events){
            if(count==10){
                break;
            }
            if(event.equals("W")){
                count++;
            }
            else if(event.equals("WD") || event.equals("NB")){
                score++;
            }
            else{
                score+=Integer.parseInt(event);
            }
        }
        return new int[]{score,count};
    }
}