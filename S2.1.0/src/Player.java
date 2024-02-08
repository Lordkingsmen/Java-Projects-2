public class Player
{
    private String playerName;
    private String email;
    private String phoneNumber;
    
    public Player(String initName, String initEmail, String initPhone)
    {
        playerName = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    public void print()
    {
        System.out.println("Name: " + playerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args)
    {
    	Player p1 = new Player("ratta", "1234@gmail.com", "123-456-7890");
        p1.print();
        Player p2 = new Player("tatta", "4321@gmail.com", "404 899-9955");
        p2.print();
    }
}