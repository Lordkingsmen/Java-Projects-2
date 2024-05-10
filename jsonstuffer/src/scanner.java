import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
		System.out.println(obj.names());
		int temp=obj.getJSONObject("state").getJSONObject("cities").getJSONObject("vancouver").getInt("currentTemp");
		System.out.println(temp);

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