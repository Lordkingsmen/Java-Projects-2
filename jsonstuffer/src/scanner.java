import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.json.JSONObject;
//use the name lists to create the objects. use for loop and a array to store variabes then make the equal the city bj.
public class scanner
{
	public static int[] readCSV(String file) throws IOException
	{
		Scanner fileScan=new Scanner(new File(file));
		String line="";
		int lines=lineC(file);
		int[] Data=null;
		while (fileScan.hasNextLine())
		{
			for(int i=0;i<lines;i++)line=line+fileScan.nextLine()+(i>=lines-1?"":",");
			String[] split=line.split(", ");
			Data=new int[split.length];
			for(int i=0;i<split.length;i++)Data[i]=Integer.parseInt(split[i]);
		}
		fileScan.close();
		return Data;
	}

	public static void readJSON(String file) throws IOException
	{
		String jsonString=new String(fToS(file));
		JSONObject obj=new JSONObject(jsonString);
		System.out.println(obj.keys());
		List<Object> cityList=(obj.names()).toList();
		List<Object> city1=(obj.getJSONObject(cityList.get(0).toString()).names()).toList();
		List<Object> city2=(obj.getJSONObject(cityList.get(1).toString()).names()).toList();
		System.out.println(cityList.get(0));
		System.out.println(city1.get(1).toString());
		int temp=obj.getJSONObject("vancouver").getInt("currentTemp");
		
		for(int i=0;i<4;i++)
		{
			System.out.print(city1.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.print(city2.get(i)+" ");
		}
		City TangiCounty = new City(77,"partially cloudy",5,"Northeast");
		TangiCounty.readCurrent();
	}

	public static String fToS(String file) throws IOException
	{
		Scanner fileScan=new Scanner(new File(file));
		String line="";
		int lines=lineC(file);
		while (fileScan.hasNextLine())
			for(int i=0;i<lines;i++)line=line+fileScan.nextLine();
		fileScan.close();
		return line;
	}

	public static int lineC(String fileN) throws IOException
	{
		  	int lines=0;
		  	BufferedReader reader=new BufferedReader(new FileReader(fileN));
			while (reader.readLine() != null)
				lines++;
			reader.close();
			return lines;
	}
}