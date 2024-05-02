public class Arr
{
	public static int[] splice(int[] arr,int a, int b)
	{
		int temp=arr[b];
		System.arraycopy(arr,a,arr,a+1,(b-a));
		arr[a]=temp;
		
		return arr;
	}
	
	
}
