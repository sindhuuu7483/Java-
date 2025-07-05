import java.util.Scanner;
public class PlanetExplorer {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double a = scan.nextDouble();
		double res = calucalateSurfaceArearadius(a);
		System.out.println("The radius of sphere is " +res);
	}
	public static double calucalateSurfaceArearadius(double r) {
		double x =  4*3.14*r;
		double y = x*x;
		return y;

	}

}

