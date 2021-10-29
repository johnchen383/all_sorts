import java.util.Arrays;

public class SelectionSort extends SortAlgo {
	
	SelectionSort(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		super(arr, withIterations, withDeets, showPred);
	}
	
	public void sort(){
		for (int i = arr.length - 1; i >= 0; i--) {
			int k = SortUtil.findmax(Arrays.copyOfRange(arr, 0, i + 1));
			numComp += Arrays.copyOfRange(arr, 0, i + 1).length - 1;
			
			if (k != i) {
				SortUtil.swap(arr, i, k);
				numSwap += 1;
			}
			
			if (withIterations) {
				System.out.print("Iteration " + (arr.length - i) + "\t");
				SortUtil.printArr(this.arr);
			}
		}
	}
	
	@Override
	public double predictComp() {
		return (double)1/2 * (n) * (n-1);
	}
	
	@Override
	public double predictSwap() {
		int n = arr.length;
		return n;
	}
	
}
