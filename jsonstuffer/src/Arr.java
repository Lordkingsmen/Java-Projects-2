public class Arr
{
	public static int[] splice(int[] arr,int a, int b)
	{//Moves int b to int a's place in array, then shifts array right to fill in int b's place.
		int temp=arr[b];
		System.arraycopy(arr,a,arr,a+1,(b-a));
		arr[a]=temp;
		
		return arr;
	}
}
