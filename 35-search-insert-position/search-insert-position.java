class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
	        if(arr[i]==target){
	            System.out.print(i);
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]==target){
	            System.out.print(i);
	        }
	    }
	    List<Integer> list = new ArrayList<>();
	    for(int i=0;i<n;i++){
	        list.add(arr[i]);
	    }
	    list.add(target);
	    Collections.sort(list);
	    for(int i=0;i<list.size();i++){
	        if(list.get(i)==target){
                return i;
	        }
	    }
        return -1;
    }
}