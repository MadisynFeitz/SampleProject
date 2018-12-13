package edu.feitz.java.week3;

public class Loops 
{

	public void forLoopSample1()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
	
	public void forLoopSample2()
	{
		String word = "Cat";
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(i);
			System.out.println(word.charAt(i));
		}
	}
	
	public void forLoopSample3()
	{
		String word = "Dog";
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(i);
			System.out.println(word.charAt(i));
		}
	}
	
	public void createMask()
	{
		String word = "Horse";
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println("*");
		}
	}
	
	public void whileSample()
	{
		int i = 0;
		while(keepRunning())
		{
			System.out.println("Help me, I don't know how to stop!");
			i++;
		}
	}
	
	private boolean keepRunning()
	{
		return true;
	}
}
