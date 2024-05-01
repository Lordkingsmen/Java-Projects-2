import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Sort
{
	private static int array[];
	private static int arrayT1[];
	private static int arrayT2[];
	
	public static void swapSort(int n) throws IOException
	{
		long start=System.nanoTime();
		swapSorter(n);
		long end=System.nanoTime();
		long timeInMillis=TimeUnit.MILLISECONDS.convert(end-start,TimeUnit.NANOSECONDS);
		System.out.println("Time spend in ms: "+timeInMillis+" "+Arrays.toString(array));
	}
	
	public static void multiSort(int n) throws IOException
	{
		long start=System.nanoTime();
		multiSorter(0,n);
		swapSorter(n);
		long end=System.nanoTime();
		long timeInMillis=TimeUnit.MILLISECONDS.convert(end-start,TimeUnit.NANOSECONDS);
		System.out.println("Time spend in ms: "+timeInMillis+" "+Arrays.toString(array));
	}
	
	static void multiSorter(int low,int high)
	{
		int mid=high/2;
		Thread thread1 = new Thread(() ->
    {
			try
			{
				arrayT1=Arrays.copyOfRange(array,low+1,mid);
				arrayT1=multSort(arrayT1.length,arrayT1);
				System.arraycopy(arrayT1,0,array,0,arrayT1.length);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() ->
    {
			try
			{
				arrayT2=Arrays.copyOfRange(array,mid+1,high);
				arrayT2=multSort(arrayT2.length,arrayT2);
				System.arraycopy(arrayT2,0,array,mid,arrayT2.length);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
		thread1.start(); 
		thread2.start();
		try
		{
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
  }
	
	public static int[] swapSorter(int high) throws IOException
	{
		int saver=0;
		boolean saved=false;
		for(int i=0;i<high-1;)
		{
			
			
			if(array[i]>array[i+1])
			{
				if(!saved)
				{
					saver=i;
					saved=true;
				}
				array[i]=(array[i]+array[i+1])-(array[i+1]=array[i]);
				i=(i==0)?(0):(i-1);
			}
			else
			{
				if(saved)
				{
					i=saver;
					saved=false;
				}
				i++;
			}
		}
		return array;
	}

	public static int[] multSort(int high,int[] arr) throws IOException
	{
		int saver=0;
		boolean saved=false;
		for(int i=0;i<high-1;)
		{
			if(arr[i]>arr[i+1])
			{
				if(!saved)
				{
					saver=i;
					saved=true;
				}
				arr[i]=(arr[i]+arr[i+1])-(arr[i+1]=arr[i]);
				i=(i==0)?(0):(i-1);
			}
			else
			{
				if(saved)
				{
					i=saver;
					saved=false;
				}
				i++;
			}
		}
		return arr;
	}
	
	static void fileType(String readType,String file) throws IOException
	{
		switch(readType)
		{
			case "CSV":
				array=scanner.readCSV(file); break;
			case "Json":
				array=scanner.readJSON(file); break;
			default:
				System.out.println("Re-enter valid file formatting type. (i.e. \"CSV\",\"Json\".)"); break;
		}
	}
}