class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    public static int binarySearch(int[] arr, int start, int end, int target){
	    	if(end>=start){
	    		int middle = (int)(start+end)/2;
		        if (arr[middle] == target) 
		            return middle;
		        else if (arr[middle] < target) 
		            return binarySearch(arr, middle+1, end, target);
		        else
		            return binarySearch(arr, start, middle-1, target);
	    	}
	    	else 
	    		return start;
	    }
}