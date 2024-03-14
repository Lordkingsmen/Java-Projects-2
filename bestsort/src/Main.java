import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/*GAME PLAN: make classes that standardize file types to a main file
 * so that this algorithm can read and sort them for interpretation.
 * also make this one recursive so it can sort larger amounts of data faster.
 */
public class Main
{
  public static void main(String[] args)
  {
	  Random rand=new Random();
	  int n=1000000,saver=0;
	  boolean saved=false;
	  int[] dset=new int[n];
	  for(int i=0;i<n;i++)
		  dset[i]=rand.nextInt(n*2)+1;
	  long start=System.nanoTime();
	  for(int i=0;i<n-1;)
	  {
		  if(i>100)
		  {
			  if(dset[i]>dset[100])
			  {
				  dset[i]=(dset[i]+dset[100])-(dset[100]=dset[i]);
			  }
		  }
		  if(dset[i]>dset[i+1])
		  {
			  if(!saved)
			  {
				  saver=i;
				  saved=true;
			  }
			  dset[i]=(dset[i]+dset[i+1])-(dset[i+1]=dset[i]);
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
	  long end=System.nanoTime();
	  long timeInMillis=TimeUnit.MILLISECONDS.convert(end-start,TimeUnit.NANOSECONDS);
	  System.out.println(Arrays.toString(dset));
	  System.out.println("Time spend in ms: "+timeInMillis);
  }
}