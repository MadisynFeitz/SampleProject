package raceCarGame;

public class Race 
{
	// How many laps
	// Winner
	// Start Time
	// Finish Time
	
	private int numberLaps;
	private int winner;
	private int startTime;
	private int finishTime;
	private int isFinished;
	
	public int getNumberLaps() 
	{
		return numberLaps;
	}
	public void setNumberLaps(int numberLaps) 
	{
		this.numberLaps = numberLaps;
	}
	public int getWinner() 
	{
		return winner;
	}
	public void setWinner(int winner) 
	{
		this.winner = winner;
	}
	public int getStartTime() 
	{
		return startTime;
	}
	public void setStartTime(int startTime) 
	{
		this.startTime = startTime;
	}
	public int getFinishTime() 
	{
		return finishTime;
	}
	public void setFinishTime(int finishTime) 
	{
		this.finishTime = finishTime;
	}
	public int getIsFinished() 
	{
		return isFinished;
	}
	public void setisFinished(int isFinished) 
	{
		this.isFinished = isFinished;
	}
	
}
