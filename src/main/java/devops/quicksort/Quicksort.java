package devops.quicksort;

public class Quicksort {
	
	public void run(int a[], int l, int r) {
		
		int key = a[(l + r)/2];
		int i = l, j = r;
		while(i <= j) {
			while(a[i] < key)
				i++;
			while(a[j] > key)
				j--;
			if(i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if(l < j)
			run(a, l, j);
		if(i < r)
			run(a, i, r);
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.print("Mang ban dau: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Quicksort qs = new Quicksort();
		qs.run(arr, 0, arr.length - 1);
		
		System.out.print("Mang da sap xep: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
