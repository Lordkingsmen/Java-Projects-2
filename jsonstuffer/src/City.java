public class City
{
	private int currentTemp;
	private String weather;
	private int windSpeed;
	private String windDirection;

	public City(int currentTemp,String weather,int windSpeed,String windDirection)
	{
		this.currentTemp=currentTemp;
		this.weather=weather;
		this.windSpeed=windSpeed;
		this.windDirection=windDirection;
	}
	public void newTemp(int a)
	{
		this.currentTemp=a;
	}
	public void newWeather(String a)
	{
		this.weather=a;
	}
	public void newWindSpeed(int a)
	{
		this.windSpeed=a;
	}
	public void newWindDirection(String a)
	{
		this.windDirection=a;
	}
	public void readCurrent()
	{
		System.out.println(
				this.currentTemp+System.lineSeparator()+
				"Current Temp: "+this.currentTemp+System.lineSeparator()+
				"Current Weather: "+this.weather+System.lineSeparator()+
				"Current Wind Speed: "+this.windSpeed+System.lineSeparator()+
				"Current Wind Direction: "+this.windDirection);
	}
}