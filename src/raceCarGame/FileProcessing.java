package raceCarGame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Simple example of reading and writing to a file.
 * There are many ways to read and write to files, this is a very simple example that 
 * works well in most scenarios encountered in this course.
 * 
 * @author mbourgeois
 */

public class FileProcessing 
{
	// There are many specialized ways to read data from files.
	// See ErrorHandling.java for details on the throws clause.
	protected void readFromFile() throws IOException
	{
		// Create a file instance.
		// Note that the users.txt file is at the 
		// root of the project, so no path is required.
		// If you put your file someplace else, you will need
		// to provide a path, or find it on the classpath.
		File f = new File("users.txt");
		
		
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String st;
		// Assign the string value and test that there is something on that line before iterating
		while((st = reader.readLine()) != null)
		{
			// Output each line in the file.
			System.out.println(st);
		}
	}
	
	protected void writeFileSample() throws IOException
	{
		
	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	    try 
	    {
	    	// This overwrites the file contents.
			writer.write("Hello \n");
			
			// This adds to it.
			writer.append("Nice to meet you...");
		} 
	    catch (IOException e) 
	    {
			throw e;
		}
	    finally
	    {
	    	writer.close();
	    }   
	}
	
	public static void main(String[] args)
	{
		FileProcessing fp = new FileProcessing();
		
		// See ErrorHanlding.java for details on the try \ catch block.
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