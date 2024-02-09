public class Main
{
	public static void main(String[] args)
    {
    	Player p1 = new Player("ratta", "1234@gmail.com", "123-456-7890",20);
        p1.print();
        Player p2 = new Player("tatta", "4321@gmail.com", "404 899-9955",35);
        p2.print();
        p2.setter("latta", "4312@outlook.com", "360-998-6296",99);
        p2.print();
        p1.ageUp();
        p1.print();
    }
}