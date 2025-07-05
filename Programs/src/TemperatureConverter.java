import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		double a = scan.nextDouble();
		double res = convertFahrenheitToCelsius(a);
		System.out.println("The converted Fahrenheit to Celsius :" +res);
	}
	public static double convertFahrenheitToCelsius(double F)
	{
		double z = (F-32)*5/9;
		return z;
	}
}
	






