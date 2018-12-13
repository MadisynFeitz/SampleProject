package raceCarGame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class ReadingFiles 
{
	List<User> users = new ArrayList<User>();
	
	public void addUser()
	{
		
		
	}
	
	public List<User> loadUsers() throws IOException
	{
		List<User> users = new ArrayList<User>();
		File f = new File("users.txt");
	
		if(f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
		
			String st;
			while ((st = br.readLine()) != null);
			{
				// Use the String.split method to break the string up 
				// into parts based on the spaces between each name.
				String[] splitNames = st.split(" ");
				User u = new User();
				u.setFirst_name(splitNames[0]);
				
				if(splitNames.length > 2)
				{
					u.setMiddle_name(splitNames[1]);
					u.setLast_name(splitNames[2]);
				}
				else
				{
					u.setLast_name(splitNames[1]);
				}
				
				users.add(u);
			}
		}
		return users;
	}
	
	
	// Test Method
	public static void main(String[] args)
	{
		ReadingFiles rf = new ReadingFiles();
		try
		{
			List<User> users = rf.loadUsers();
			for(User user : users)
			{
				System.out.println(user.getFirst_name() + "" + user.getLast_name());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
