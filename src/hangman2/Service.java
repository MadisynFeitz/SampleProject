package hangman2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service 
{
	List<Call> names;
	public List<Call> loadNames() throws IOException 
	{
		List<Call> users = new ArrayList<Call>();
		File f = new File("Names.txt");
		
		
			BufferedReader br = new BufferedReader(new FileReader(f));
	
			String st;
			while ((st = br.readLine()) != null)
			{
				String[] splitNames = st.split(" ");
				Call u = new Call();
				u.setHint(splitNames[0]);
				
				if(splitNames.length > 1) 
				{
					u.setWord(splitNames[1]);
				}
				else
				{
					u.setWord(splitNames[1]);
				}
				names.add(u);
			}
		
		return names;
	}
		public static void main(String[] args) 
		{
			Service rf = new Service();
			
			List<Call> names;
				try 
				{
					names = rf.loadNames();
				
					for(Call Call : names)
					{
						System.out.println(Call.getHint() + " " + Call.getWord());
					}
				} 
				catch (IOException e) 
				{

					e.printStackTrace();
				}
			
		}
}
