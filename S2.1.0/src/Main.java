import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
    {
		boolean[] lean = new boolean[6];
		Account a1 = new Account("Jim", "12345@yahoo.com", "503-1234-567", "2/12/2022", 2);
		a1.print();
		System.out.println(Arrays.toString(lean));
		a1.roll(lean);
    }
}