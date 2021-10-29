import java.util.Arrays;

public class QuickSort extends SortAlgo {
	QuickSort(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		super(arr, withIterations, withDeets, showPred);
	}

	public void sort() {
		sort(arr, 0, arr.length - 1);
	}
	
	private void sort(int arr[], int low, int high){
	    if (low < high)
	    {
	        int pi = partition(arr, low, high);
	        
	        if (withIterations)
        		SortUtil.printArr(Arrays.copyOfRange(arr, low, pi));
	        sort(arr, low, pi - 1);  // Before pi
	        
	        if (withIterations)
        		SortUtil.printArr(Arrays.copyOfRange(arr, pi + 1, high + 1));
	        sort(arr, pi + 1, high); // After pi
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
	    		numComp++;
	    	} while (l < high && arr[l] < pivot);
	    	do {
	    		r--;
	    		numComp++;
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
