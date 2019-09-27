public class InsertionSort implements SortingAlgorithm
{
	/**
	* This command sorts the array with the help with the swap() command integrated within it.
	* @param arr
	*/
	public void sort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = i; j > 0; j--)
				if(arr[j] < arr[j - 1])
					swap(arr, j-1, j);
		}
	}

	/**
	* Creates a temp variable in order to swap the position of two numbers within an array.
	* @param arr - The array that has the two numbers being swapped
	* @param a - The number on the left to be swapped
	* @param b - The number on the right that will be swapped.
	*/

	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}