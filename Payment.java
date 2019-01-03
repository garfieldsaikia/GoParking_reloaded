package name;

public class Payment {
	private int smallRate, mediumRate, largeRate, additionalRate;
	private int finalRate;
	Payment()
	{
		smallRate = 20;
		mediumRate = 30;
		largeRate = 50;
		additionalRate = 10;
	}
	public void setSmallRate(int smallRate)
	{
		this.smallRate = smallRate;
	}
	public void setMediumRate(int mediumRate)
	{
		this.mediumRate = mediumRate;
	}
	public void setLargeRate(int largeRate)
	{
		this.largeRate = largeRate;
	}
	
	public void finalRate(int rate, float duration)
	{
		finalRate = rate + ((int)Math.ceil(duration-1) * additionalRate);
		System.out.println("Your parking rate is: INR" + finalRate);
	}
}
