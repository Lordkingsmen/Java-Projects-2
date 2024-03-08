import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main
{
  public static void main(String[] args)
  {
	  Random rand=new Random();
	  int n=100000,saver=0;
	  long changes=0;
	  boolean saved=false;
	  int[] dataset=new int[n];
	  for(int i=0;i<n;i++)
		  dataset[i]=rand.nextInt(n*2)+1;
	  long start=System.nanoTime();
	  for(int i=0;i<n-1;)
	  {
		  if(dataset[i]>dataset[i+1])
		  {
			  if(!saved)
			  {
				  saver=i;
				  saved=true;
			  }
			  int temp=dataset[i];
			  dataset[i]=dataset[i+1];
			  dataset[i+1]=temp;
			  if(i==0) i=0;
			  else i--;
			  changes++;
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
	  long end=System.nanoTime();
	  long timeInMillis=TimeUnit.MILLISECONDS.convert(end-start,TimeUnit.NANOSECONDS);
	  System.out.println(Arrays.toString(dataset));
	  System.out.println("Time spend in ms: "+timeInMillis);
	  System.out.println(changes);
  }
}