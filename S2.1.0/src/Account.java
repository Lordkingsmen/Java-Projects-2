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
    	String[] v = {"","","","",""};
    	for(int i=0;i<dice.length;i++)
    		dice[i]=!j[i]?rand.nextInt(6)+1:dice[i];
    	for(int i=0;i<dice.length;i++)
			switch(dice[i])
			{
				case 1: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "|       |";
						v[2]=v[2] + "|   0   |";
						v[3]=v[3] + "|       |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
				case 2: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "|     0 |";
						v[2]=v[2] + "|       |";
						v[3]=v[3] + "| 0     |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
				case 3: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "|     0 |";
						v[2]=v[2] + "|   0   |";
						v[3]=v[3] + "| 0     |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
				case 4: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "| 0   0 |";
						v[2]=v[2] + "|       |";
						v[3]=v[3] + "| 0   0 |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
				case 5: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "| 0   0 |";
						v[2]=v[2] + "|   0   |";
						v[3]=v[3] + "| 0   0 |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
				case 6: v[0]=v[0] + " _______ ";
						v[1]=v[1] + "| 0   0 |";
						v[2]=v[2] + "| 0   0 |";
						v[3]=v[3] + "| 0   0 |";
						v[4]=v[4] + " ‾‾‾"+(i+1)+"‾‾‾ "; break;
			}
    	for(int i=0;i<v.length;i++)
    		System.out.println(v[i]);
    }
}