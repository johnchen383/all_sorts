public class MergeSort extends SortAlgo {
	MergeSort(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		super(arr, withIterations, withDeets, showPred);
	}
	
	public void sort() {
		int[] tmp = new int[arr.length];
		sort(arr, tmp, 0, arr.length - 1);
	}

	private void sort(int[] a, int[] tmp, int i, int j) {
		if (i < j) {
			int m = (i + j) / 2;

			sort(a, tmp, i, m);
			sort(a, tmp, m + 1, j);

			merge(a, tmp, i, m + 1, j);
			
			if (withIterations) {
				System.out.print("Iteration " + "\t");
				SortUtil.printArr(this.arr);
			}
		}
	}

	private void merge(int[] a, int[] tmp, int left, int right, int end) {
//		int lend = right - 1;
		int nl = right;
		int nr = end;
		
		int k = left;
		int i = left;
		int j = right;
		
		// Main loop
		while (i < nl && j <= nr) {
			if (a[i] <= a[j]) {
				numComp++;
				tmp[k++] = a[i++];
			} else {
				numComp++;
				tmp[k++] = a[j++];
			}
			
		}
		
		// Copy the rest of the first half
		while (i < nl) {
			tmp[k++] = a[i++];
		}
		
		// Copy the rest of the second half
		while (j <= nr) {
			tmp[k++] = a[j++];
		}

		// Copy tmp array back
		for (k = left; k <= nr; k++) {
			a[k] = tmp[k];
		}
	}

}
