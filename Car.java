package name;

public class Car 
{
	protected Location loc = new Location();
}

class SmallCar extends Car
{
	SmallCar(int x, int y)
	{
		loc.setLocation(x, y);
	}
}

class MediumCar extends Car
{
	MediumCar(int x, int y)
	{
		loc.setLocation(x, y);
	}
}

class LargeCar extends Car
{
	LargeCar(int x, int y)
	{
		loc.setLocation(x, y);
	}
}
