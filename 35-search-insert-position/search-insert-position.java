class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
	        if(arr[i]==target){
	            System.out.print(i);
	        }
	    }
	    boolean visited = false;
	    List<Integer> list = new ArrayList<>();
	    for(int i=0;i<n;i++){
	        if(!visited && target<arr[i]){
	            list.add(target);
	            visited=true;
	        }
	        list.add(arr[i]);
	    }
	    if(!visited){
	        list.add(target);
	    }
	    for(int i=0;i<list.size();i++){
	        if(list.get(i)==target){
	            return i;
	        }
	    }
        return -1;
    }
}