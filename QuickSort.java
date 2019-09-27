public class QuickSort implements SortingAlgorithm
{
	public /*static*/ void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public /*static*/ void sort(int[] arr)
	{
		quickSort(arr, 0, arr.length - 1);
	}

	public /*static*/ void quickSort(int[] arr, int left, int right)
	{
		if(left < right)
		{
			int p = partition(arr, left, right);
			quickSort(arr, left, p - 1);
			quickSort(arr, p + 1, right);
		}
	}

	public /*static*/ int partition(int[] arr, int left, int right)
	{
		while(left < right)
		{
			int pivot = left;
			int i = left;
			int j = right;
			while(i <= j) {
				while((i <= j) && (arr[i] <= arr[pivot]))
					i++;
				while((j >= i) && (arr[j] >= arr[pivot]))
					j--;
				if(i < j)
					swap(arr, i, j);
			}
			swap(arr, pivot, j);
			return(j);
		}
		return(left);
	}

	/*public static void main(String[] args)
	{
		int[] Arr = new int[8];
		Arr[0] = 3; Arr[1] = 9; Arr[2] = 5; Arr[3] = 29; Arr[4] = 24; Arr[5] = 12; Arr[6] = 21; Arr[7] = 17;
		for(int i = 0; i < Arr.length; i++)
			System.out.print(Arr[i] + " ");
		System.out.println();
		sort(Arr);
		for(int j = 0; j < Arr.length; j++)
			System.out.print(Arr[j] + " ");
	}*/
}