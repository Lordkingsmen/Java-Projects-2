abstract class Planet
{
    String Name = " ";

    Planet(String name)
    {
        this.Name = name;
    }
    public void Information(String detail)
    {
        System.out.println("The details of planet " + this.Name + " is: " + detail);
    }
    abstract public void Location(String T);
    abstract public void MassSetter(double d);
    public void Explode()
    {
    	this.M=0;
		System.out.println("It's mass is now "+M+" Earth's mass.");
    }
    public double M;
}
class Terrestrial extends Planet
{
	Terrestrial(String name)
	{
        super(name);
    }
    public void Location(String T)
    {
        System.out.println("This Exoplanet's location is in the "+T);
    }
    public void MassSetter(double M)
    {
    	this.M=M;
        System.out.println("It's mass is "+M+" Earth's mass.");
    }
}
class Gas_Giant extends Planet
{

	Gas_Giant(String name)
	{
		super(name);
	}
	public void Location(String T)
	{
		System.out.println("This Exoplanet's location is in the "+T);
	}
	public void MassSetter(double M)
	{
		System.out.println("It's mass is "+M+" Earth's mass.");
	}
}
public class Test
{
    public static void main(String[] args)
    {
    	Planet obj1 = new Terrestrial("Mercury");
    	obj1.Information("Mercury is the first planet in the solar system Sol.");
    	obj1.Location("Inner Sol System.");
    	obj1.MassSetter(0.055);
    	obj1.Explode();
        Planet obj2 = new Terrestrial("Venus");
        obj2.Information("Venus is named after the Roman Goddes of Love.");
        obj2.Location("Inner Sol System.");
        obj2.MassSetter(0.815);
        obj2.Explode();
        Planet obj3 = new Gas_Giant("Saturn");
        obj3.Information("Saturn is the first ringed planet in the Sol system.");
        obj3.Location("Outer Sol System.");
        obj3.MassSetter(95.159);
        obj3.Explode();
    }
}