class Student
{
	private String Name;
	private int Age;
	private String Password;
	public Student()
	{
		Name = "";
		Age = 0;
	}
	public Student(String n)
	{
		Name = n;
		Age = 0;
	}
	public Student(String n, int a)
	{
		Name = n;
		Age = a;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student("Johnathan Joestar");	
	}
}