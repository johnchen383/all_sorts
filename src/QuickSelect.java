import java.util.Arrays;

public class QuickSelect {
	int[] arr;
	Boolean withIteration;
	
	
	QuickSelect(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		this.arr = arr;
		this.withIteration = withIterations;
	}

	public int select(int rank) {
		return select(arr, 0, arr.length - 1, rank);
	}
	
	private int select(int arr[], int low, int high, int rank){
	    if (low <= high)
	    {
	        int pi = partition(arr, low, high);
	        int q = pi - low + 1;
	        
	        if (q == rank) {
	        	return arr[pi];
	        } else if (rank < q) {
	        	if (withIteration)
	        		SortUtil.printArr(Arrays.copyOfRange(arr, low, pi));
	        	return select(arr, low, pi - 1, rank); 
	        } else {
	        	if (withIteration)
	        		SortUtil.printArr(Arrays.copyOfRange(arr, pi + 1, high + 1));
	        	return select(arr, pi + 1, high, rank - q);
	        }
	    } else {
	    	return -1;
	    }
	}
	
	
	public int partition(int arr[], int low, int high)
	{
	    int pivot = arr[low];  
	    int l = low;
	    int r = high + 1;
	    
	    while (true) {
	    	do {
	    		l++;
	    	} while (l < high && arr[l] < pivot);
	    	do {
	    		r--;
	    	} while (r > low && arr[r] > pivot);
	    	if (l < r) {
	    		SortUtil.swap(arr, l, r);
	    	} else {
	    		SortUtil.swap(arr, low, r);
	    		return r;
	    	}
	    }
	}
}
