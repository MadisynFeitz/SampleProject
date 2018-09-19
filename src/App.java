// Name space - keeping objects unique.
// Translates to folder.
// Helps you organize 'like' code.
// Package would be up here.

// App is the entry point to our application.
public class App 
{
	public static void main(String[] argz)
	{
		User u1 = new User();
		u1.setFirstName("Peter");
		u1.setLastName("Parker");
		u1.setEmail("Peter@parker.com");
		u1.setUserName("Spiderman");
		
		User u2 = new User();
		u2.setFirstName("Tony");
		u2.setLastName("Stark");
		u2.setEmail("Tony@stark.com");
		u2.setUserName("Ironman");
		
		User u3 = new User();
		u3.setFirstName("Steve");
		u3.setLastName("Rogers");
		u3.setEmail("Steve@rogers.com");
		u3.setUserName("Cap");
		
		User u4 = new User();
		u4.setFirstName("Thor");
		u4.setLastName("SonofOdin");
		u4.setEmail("Strongest@avenger.com");
		u4.setUserName("GodofThunder");
		
		User u5 = new User();
		u5.setFirstName("Bruce");
		u5.setLastName("Banner");
		u5.setEmail("Bruce@banner.com");
		u5.setUserName("TheHulk");
		
		User u6 = new User();
		u6.setFirstName("T'Challa");
		u6.setLastName("King");
		u6.setEmail("Wakanda@forever.com");
		u6.setUserName("BlackPanther");
		
		// Call a service that returns hundreds of users....
		
		System.out.println(u1.getEmail());
		System.out.println(u2.getEmail());
		System.out.println(u3.getEmail());
		System.out.println(u4.getEmail());
		System.out.println(u5.getEmail());
		System.out.println(u6.getEmail());
		
		// For Loop
		for(int x = 0; x < 100; x++)
		{
			// Prompt user to guess a letter.
			
			// Prompt user with mask of word. ( Recalculate mask )
			
			// Prompt user with hint. 
			
			// Collect user input.
			
			// Repeat ...
			
			System.out.println(x);
		} // increment counter
	}
	
	// Ask Mike how to do this
	private void generateMask()
	{
		// Print the word for now.
	}
}
