import java.util.Scanner;
public class DoubletheNumber {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int num = doublethenumber(a);
	
		System.out.println("The double of number : "+num);
	}
	public static int doublethenumber(int num)
	{
		int a = 2*num;
		return a;
	}
}
	
	
		
		
	
	





