import java.io.IOException;
/*GAME PLAN: make classes that standardize file types to a main file
 * so that this algorithm can read and sort them for interpretation.
 * also make this one recursive so it can sort larger amounts of data faster.
 * 
 * make it so when i find the chunk it needs to be in, it checks the sub-chunks then those and so on.
 * if i is a number between this chunks highest and lowest number check the sub chunks then 
 * keep checking until same is found then checks those sub chunks and so on.
 */
public class Main
{
  public static void main(String[] args) throws IOException
  {
	  Sort.fileType("CSV","src\\Data.csv");
	  Sort.multiSort(100000);
	  //Sort.swapSort(100000);
  }
}