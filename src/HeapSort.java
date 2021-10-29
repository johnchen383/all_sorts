
public class HeapSort extends SortAlgo {
	HeapSort(int[] arr, Boolean withIterations, Boolean withDeets, Boolean showPred){
		super(arr, withIterations, withDeets, showPred);
	}
	
	public void sort() {
		//MAKEHEAP
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			bubbleDown(arr, i, arr.length);
		}
		
		System.out.print("Built: \t\t");
		SortUtil.printArr(this.arr);
		// successively delete the max and restore the heap
		for (int i = arr.length - 1; i >= 1; i--) {
			SortUtil.swap(arr, 0, i);
			bubbleDown(arr, 0, i);
			if (withIterations) {
				System.out.print("Iteration " + (arr.length - i) + "\t");
				SortUtil.printArr(this.arr);
			}
		}
	}

	// Heapifying method to restore a heap a[0],...,a[size-1]
	// after changing a[ i ]; a child / parent position is one
	// greater than an index of the same array element
	private void bubbleDown(int[] a, int i, int size) {
		int child;
		int parent = i + 1;
		
		for (child = parent * 2; child < size; child = parent * 2) {
			
			if (a[parent - 1] < a[child - 1] || a[parent - 1] < a[child]) {
				if (a[child - 1] < a[child]) {
					SortUtil.swap(a, parent - 1, child);
					parent = child + 1;
				} else {
					SortUtil.swap(a, parent - 1, child - 1);
					parent = child;
				}
			} else
				break;
		}
		
		if (child == size && a[parent - 1] < a[child - 1]) {
			SortUtil.swap(a, parent - 1, child - 1);
		}
	}

}
