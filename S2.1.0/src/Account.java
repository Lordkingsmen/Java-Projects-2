import java.util.*;

public class Account
{
    private String accountName;
    private String email;
    private String phoneNumber;
    private String creationDate;
    private int accountAge;
    private int[] dice=new int[5];
    
    public Account(String accountName,String email,String phoneNumber,String creationDate,int accountAge)
    {
    	this.accountName=accountName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.creationDate=creationDate;
        this.accountAge=accountAge;
    }

    public void print()
    {
        System.out.println("Name: "+accountName);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Account Creation Date: "+creationDate);
        System.out.println("Current Account Age(Years): "+accountAge);
    }
    
    public void roll(boolean j[])
    {
    	Random rand = new Random();
    	for(int i=0;i<dice.length;i++)
    		dice[i]=j[i]?rand.nextInt(6)+1:dice[i];
    	System.out.println(Arrays.toString(dice));
    }
}