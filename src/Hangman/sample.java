package Hangman;

import java.util.Scanner;

public class sample 
{
	Game g = new Game("Meow", "Cat");
	Game g1 = new Game("Woof", "Cat");
	
		public void playGame()
		{					
			Scanner sc = new Scanner(System.in);
			
			while(!g.isSolved())
			{
				System.out.println("Guess a letter");
				
				System.out.println("Hint" + g.getHint());
				
				System.out.println("Mask" + g.generateMask());
				
				String userGuess = sc.nextLine();
				
				g.setGuesses(userGuess);	
			}
			
			
		}
		
		public static void main(String[] args)
		{
			sample app = new sample();
			app.playGame();
		}
}