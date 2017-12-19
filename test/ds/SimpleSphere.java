import java.lang.Math;

public class SimpleSphere
{
	private double radius;
	public static final double DEFAULT_RADIUS = 1.0;
	public SimpleSphere()
	{
		radius = DEFAULT_RADIUS;
	}
	public SimpleSphere(double r)
	{
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getVolume()
	{
		double radiusCubed = radius * radius * radius;
		return 4 * Math.PI * radiusCubed / 3;
	}
}