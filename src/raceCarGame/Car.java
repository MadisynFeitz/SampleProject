package raceCarGame;

public class Car 
{
	// How many miles until empty
	
	private int topSpeed;
	private int acceleration;
	private int mpg;
	private int tankSize;
	
	public Car(int topSpeed, int mpg, int tankSize)
	{
		this.topSpeed = topSpeed;
		this.mpg = mpg;
		this.tankSize = tankSize;
	}
	
	public int getTopSpeed() 
	{
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) 
	{
		this.topSpeed = topSpeed;
	}
	public int getAcceleration() 
	{
		return acceleration;
	}
	public void setAcceleration(int acceleration) 
	{
		this.acceleration = acceleration;
	}
	public int getMpg() 
	{
		return mpg;
	}
	public void setMpg(int mpg) 
	{
		this.mpg = mpg;
	}
	public int getTankSize() 
	{
		return tankSize;
	}
	public void setTankSize(int tankSize) 
	{
		this.tankSize = tankSize;
	}
	
	public int getMilesTillNextPitStop(int distanceTraveled)
	{
		int milesTillEmpty = 0;
		// Solve for 2 test cases ...
		// if
		// else
		// gasTillTankEmpty = tanksize - (Distance traveled / mpg);
		// return gasTillEmpty;
		return milesTillEmpty;
	}

	public static void main(String[] arg)
	{
		// Need to determine n
		int n = 9;
		Car car1 = new Car(100, 20, 10);
		if(car1.getMilesTillNextPitStop(20) == n)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		int o = 19;
		Car car2 = new Car(100, 15, 20);
		if(car2.getMilesTillNextPitStop(15) == o)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		// Test case 1: Test miles left in car.
		// If top speed is 100. NOT a variable in this?
		// If mpg is 20.
		// If tank size is 10 gallons.
		// If car has gone 20 miles the tank should have 9 gallons
	}
}