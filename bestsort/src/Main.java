import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main
{
  public static void main(String[] args)
  {
	  Random rand=new Random();
	  int n=100000,saver=0,Ssvr;
	  long changes=0;
	  boolean[] newH=new boolean[n];
	  boolean saved=false;
	  int[] dset=new int[n];
	  for(int i=0;i<n;i++)
		  dset[i]=rand.nextInt(n*2)+1;
	  long start=System.nanoTime();
	  for(int i=0;i<n-1;)
	  {
		  if(!newH[i])
		  {
			  Ssvr=dset[i];
			  newH[i]=true;
		  }
		  if(dset[i]>dset[i+1])
		  {
			  if(!saved)
			  {
				  saver=i;
				  saved=true;
			  }
			  dset[i] = (dset[i] + dset[i+1]) - (dset[i+1] = dset[i]);
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
	  System.out.println(Arrays.toString(dset));
	  System.out.println("Time spend in ms: "+timeInMillis);
	  System.out.println(changes);
  }
}