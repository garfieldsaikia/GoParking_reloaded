package name;

import java.awt.Point;

public class Location
{
	private Point carPoint;
	protected Point parkPoint;
	private static int smallSlots, mediumSlots, largeSlots;
	
	Location()
	{
		smallSlots = mediumSlots = largeSlots = 0;
	}
	public void setLocation(int x, int y)
	{
		carPoint = new Point(x,y);
	}
	public void setSlotSize(int small, int medium, int large)
	{
		smallSlots = small;
		mediumSlots = medium;
		largeSlots = large;
	}
}

class Marathahalli extends Location
{
	Marathahalli(int x, int y)
	{
		parkPoint = new Point(x,y);
	}
}

class AECS extends Location
{
	AECS(int x, int y)
	{
		parkPoint = new Point(x,y);
	}
}

class Vydehi extends Location
{
	Vydehi(int x, int y)
	{
		parkPoint = new Point(x,y);
	}
}

class ITPL extends Location
{
	ITPL(int x, int y)
	{
		parkPoint = new Point(x,y);
	}
}

class Kadugodi extends Location
{
	Kadugodi(int x, int y)
	{
		parkPoint = new Point(x,y);
	}
}

