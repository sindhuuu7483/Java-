//Question 5: Problem: The Journey Calculator

//You are a developer at a transportation company. The company is developing a new app that helps users track their journey. One of the features of the app is to calculate the distance travelled given the speed and time of the journey. Your task is to create a method that takes speed and time and returns the distance travelled. This method should be a non-static method and should be implemented inside a class named JourneyCalculator.

//Class Definition:

//public class JourneyCalculator {

//public double calculateDistance(double speed, double time);

//}




import java.util.Scanner;
public class cubeNumber {
	public static void main(String []args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int res = cubeNumber(a);
		System.out.println("The cube the number is : " +res);
	}
	public static int cubeNumber(int num1)
	{
		int z = num1 * num1 * num1;
		return z;
		
	}

}


