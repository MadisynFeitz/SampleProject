package hangman2;

public class Game
{
	private String hint;
	private String word;
	private String guesses = "";
	
	public Game(String hint, String word)
	{
		this.hint = hint;
		this.word = word;
	}
	
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getGuesses() {
		return guesses;
	}
	public void setGuesses(String guesses) {
		this.guesses += guesses;
	}
	
	public boolean isSolved()
	{
		return !generateMask().contains("*");
	}
	
	public String generateMask()
	{
		String mask = "";
		
		for(int i = 0; i < word.length(); i++)
		{
			String currentChar = String.valueOf(word.charAt(i));
			
			if (guesses.contains(currentChar))
			{
				mask += currentChar;
			}
			else
			{
				mask += "*";
			}
			
		}
		
		return mask;
	}
}