public class Player
{
    private String playerName;
    private String email;
    private String phoneNumber;
    private int age;
    
    public Player(String initName, String initEmail, String initPhone, int initAge)
    {
        playerName = initName;
        email = initEmail;
        phoneNumber = initPhone;
        age = initAge;
    }

    public void print()
    {
        System.out.println("Name: " + playerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("account age: " + age);
    }
    
    public void setter(String newName, String newEmail, String newPhone, int newAge)
    {
    	playerName = newName;
    	email = newEmail;
    	phoneNumber = newPhone;
    	age = newAge;
    }
    
    public void ageUp()
    {
    	age++;
    }
}