package UserModeling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service 
{
		List<Order> names;
		public List<Order> loadNames() throws IOException 
		{
			List<Order> users = new ArrayList<Order>();
			File f = new File("Names.txt");
			
			
				BufferedReader br = new BufferedReader(new FileReader(f));
		
				String st;
				while ((st = br.readLine()) != null)
				{
					String[] splitNames = st.split(" - ");
					Order u = new Order();
					u.setQuestion(splitNames[0]);
					
					if(splitNames.length > 1) 
					{
						u.setAnswer(splitNames[1]);
					}
					else
					{
						u.setAnswer(splitNames[1]);
					}
					names.add(u);
				}
			
			return names;
		}
			public static void main(String[] args) 
			{
				Service rf = new Service();
				
				List<Order> names;
					try 
					{
						names = rf.loadNames();
					
						for(Order Call : names)
						{
							System.out.println(Call.getQuestion() + " - " + Call.getAnswer());
						}
					} 
					catch (IOException e) 
					{

						e.printStackTrace();
					}
			}
	}
