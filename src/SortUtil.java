public class SortUtil {
	
	public static void swap(int[] arr, int m, int n) {
		int t = arr[m];
		arr[m] = arr[n];
		arr[n] = t;
	}
	
	public static void printArr(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println("");
	}
	
	public static void testSort(int[] arr, SortAlgo instance) {
		System.out.println("Testing: \t" + instance.getClass().toString());
		System.out.print("Initial \t");
		printArr(instance.arr);
		instance.sort();
		System.out.print("After \t\t");
		printArr(instance.arr);
		
		if (instance.showdeets) {
			printOperations(instance.numComp, instance.numSwap);
		}
		
		if (instance.showPred) {
			printOperations(instance.predictComp(), instance.predictSwap());
		}
	}
	
	public static void printOperations(double comp, double move) {
		System.out.println("");
		System.out.println("Number of comparisons: " + comp);
		System.out.println("Number of data movements: " + move);
	}
	
	public static int findmax(int[] arr) {
		int k = 0;
		
		for (int j = 1; j <= arr.length - 1; j++) {
			if (arr[k] < arr[j]) {
				k = j;
			}
		}		
		
		return k;
	}
}
