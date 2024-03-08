public class Main
{
  public static void main(String[] args)
  {
    int result = factorio(1, 5);
    System.out.println(result);
  }
  public static int factorio(int start, int end)
  {
    if (end > start)
    {
    	System.out.println(end);
    	return end * factorio(start, end - 1);
    }
    else
    {
    	return end;
    }
  }
}