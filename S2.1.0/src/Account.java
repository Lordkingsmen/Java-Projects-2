public class Account
{
    private String accountName;
    private String email;
    private String phoneNumber;
    private String creationDate;
    private int accountAge;
    
    public Account(String accountName, String email, String phoneNumber, String creationDate, int accountAge)
    {
    	this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creationDate = creationDate;
        this.accountAge = accountAge;
    }

    public void print()
    {
        System.out.println("Name: " + accountName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Creation Date: "+creationDate);
        System.out.println("Current Account Age(Years): "+accountAge);
    }
}