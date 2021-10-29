public class InsertionSort extends SortAlgo {
	InsertionSort(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		super(arr, withIterations, withDeets, showPred);
	}
	
	
	public void sort(){
		for (int i = 1; i <= arr.length - 1; i++) {
			int j = i - 1;
			
			while ( j >= 0 && arr[j] > arr[j + 1]) {
				numComp++;
				numSwap++;
				SortUtil.swap(arr, j, j + 1);
				j--;
			}
			
			numComp++;
			
			if (withIterations) {
				System.out.print("Iteration " + i + "\t");
				SortUtil.printArr(this.arr);
			}
		}
	}
	
	@Override
	public double predictComp() {
		return (double)1/2 * (n) * (n-1) + n - 1;
	}
	
	@Override
	public double predictSwap() {
		return (double)1/2 * (n) * (n-1);
	}

}
