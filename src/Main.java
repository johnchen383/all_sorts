
public class Main {

	public static void main(String[] args) {
		//array, show iterations, show movements, show predictions
		int[] a1 = {4, 3, 2, 1};
		int[] a2 = {1, 2, 3, 4};
		int[] a3 = {1, 3, 2, 4};
		int[] a4 = {2, 1, 4, 3};
//		int[] a5 = {7, 2, 5, 8, 10, 1, 0, 5, 11};
		
//		testQuickSelect(a5);x
		
		SortAlgo mysor = new MergeSort(a1, false, true, false);
		SortAlgo mysor2 = new MergeSort(a2, false, true, false);
		SortAlgo mysor3 = new MergeSort(a3, false, true, false);
		SortAlgo mysor4 = new MergeSort(a4, false, true, false);
		
		SortUtil.testSort(a1, mysor);
		SortUtil.testSort(a2, mysor2);
		SortUtil.testSort(a3, mysor3);
		SortUtil.testSort(a4, mysor4);
	}
	
	public static void testQuickSelect(int[] arr) {
		QuickSelect mysel = new QuickSelect(arr, true, true, true);
		System.out.println(mysel.select(5));
	}
	
}
