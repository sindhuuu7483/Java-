public class JourneyCalculator
{
	double speed;
	double time;
	
	public JourneyCalculator(double speed,double time)
	{
		this.speed = speed;
		this.time = time;
	}
	public double calculateDistance(double speed,double time)
	{
		return speed*time;
	}	
}




