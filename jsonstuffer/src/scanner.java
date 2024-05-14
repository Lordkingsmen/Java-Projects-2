import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

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
		List<Object> something=(obj.getJSONObject("cities").names()).toList();
		List<Object> eo=(obj.getJSONObject("cities").getJSONObject("vancouver").names()).toList();
		System.out.println(something.get(0));
		System.out.println(eo.get(1));
		int temp=obj.getJSONObject("cities").getJSONObject("vancouver").getInt("currentTemp");
		
		String city=obj.getJSONObject("cities").getJSONObject("vancouver").toString();
		System.out.println(temp+"\n"+city);

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