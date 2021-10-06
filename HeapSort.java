public class HeapSort {
	public void sort(int arr[])
	{
		int n = arr.length;

		
		for (int i = n / 2 - 1; i >= 0; i--)    // Edited by Digbijoy Dasgupta
			heapify(arr, n, i);

		
		for (int i = n - 1; i > 0; i--) {
			
			int temp = arr[0];
			arr[0] = arr[i];       //Edited by Digbijoy Dasgupta
			arr[i] = temp;

			
			heapify(arr, i, 0);
		}
	}

	
	void heapify(int arr[], int n, int i)
	{
		int largest = i;         //Edited by Digbijoy Dasgupta 
		int l = 2 * i + 1; 
		int r = 2 * i + 2;       //Edited by Digbijoy Dasgupta

		
		if (l < n && arr[l] > arr[largest])
			largest = l;

		
		if (r < n && arr[r] > arr[largest])   //Edited by Digbijoy Dasgupta
			largest = r;

		
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];       //Edited by Digbijoy Dasgupta
			arr[largest] = swap;

			
			heapify(arr, n, largest);
		}
	}

	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");         //Edited by Digbijoy Dasgupta
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };             //Edited by Digbijoy Dasgupta
		int n = arr.length;    

		HeapSort ob = new HeapSort();             //Edited by Digbijoy Dasgupta
		ob.sort(arr);                            //Edited by Digbijoy Dasgupta

		System.out.println("Sorted array is");
		printArray(arr);
	}
}
