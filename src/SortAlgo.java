
public abstract class SortAlgo {
	double n;
	int numComp = 0;
	int numSwap = 0;
	public int[] arr;
	Boolean withIterations;
	Boolean showdeets;
	Boolean showPred;
	
	SortAlgo(int[] arr, Boolean withIterations, Boolean showdeets, Boolean showPred){
		this.arr = arr;
		this.withIterations = withIterations;
		this.showdeets = showdeets;
		this.showPred = showPred;
		this.n = arr.length;
	}
	
	public abstract void sort();
	
	public double predictComp() {
		return -1;
	}
	
	public double predictSwap() {
		return -1;
	}
}
