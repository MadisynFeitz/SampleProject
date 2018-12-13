package raceCarGame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This sample, though similar to the FileProcessing samples, is intended to 
 * focus on error handling.
 * 
 * In Error handling, you have two basic decisions to make.  
 * Do I catch the error, or do I throw it?
 * 
 * The decision is surprising simple...
 * - If you can fix or solve the error, catch it.
 * - If not throw it all the way up until you hit the user layer.  
 * Command line, UI, web interface.  Once at the user layer, inform the user of the error where appropriate.
 * 
 * Informing the user might be considered 'solving the error', like in the first rule above.
 * 
 * 
 * @author mbourgeois
 */

public class ErrorHandling 
{
	
	// IN this case, because readline throws an exception, I either need to catch it or throw it.
	// I chose throw because I can't solve the problem, so I will bubble it upto the user layer.  
	// In this case, my main method and will print it to the console.
	protected void readFromFile() throws IOException
	{
		File f = new File("users.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String st;
		
		while((st = reader.readLine()) != null)
		{
			System.out.println(st);
		}
	}
	
	// This is a slighly more complicated case.  In this case, I am both catching and throwing the 
	// error.  I catch it so that I can use my finally clause to assure that the writer is closed
	// and doesn't eat up unused resources.
	protected void writeFileSample() throws IOException
	{
		
	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	    try 
	    { // Try to execute this code.
	    	// This overwrites the file contents.
			writer.write("Hello \n");
			
			// This adds to it.
			writer.append("Nice to meet you...");
		} 
	    catch (IOException e) // If an IOException occurs, rethrow the error.
	    {
			throw e;
		}
	    finally // Once control is returned, the writer can be closed.
	    {
	    	writer.close();
	    }   
	}
	
	public static void main(String[] args)
	{
		FileProcessing fp = new FileProcessing();
		
		// I consider the main method to be my 'user layer' in this application
		// so I will catch the errors and print them to the console.
		try 
		{
			fp.readFromFile();
			fp.writeFileSample();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}