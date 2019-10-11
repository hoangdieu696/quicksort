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


}
