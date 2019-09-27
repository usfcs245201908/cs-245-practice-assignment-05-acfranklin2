import java.util.*;

public class MergeSort implements SortingAlgorithm
{
	public void sort(int[] arr)
	{
			if(arr.length >= 2)
			{
				int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
				int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
				sort(left);
				sort(right);
				merge(arr, left, right);
			}
	}

	private void merge(int[] arr, int[] left, int[] right) {
		int i = 0; int j = 0; int k = 0;
		while((i < left.length) && (j < right.length))
		{
			if(left[i] <= right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while(i < left.length)
			arr[k++] = left[i++];
		while(j < right.length)
			arr[k++] = right[j++];
	}
}