//Question:2 Problem: Arithmetic Operations

//You are a programmer in a school. The mathematics teacher has asked for 
//your help to teach basic arithmetic operations to students. 
//Your task is to create a set of functions that will do 
//subtraction, multiplication, division, and find the remainder of two numbers.

//Functions:

//public static int subtractNumbers(int num1, int num2);

//public static int multiplyNumbers(int num1, int num2);

//public static double divideNumbers(int num1, int num2);

//public static int findRemainder(int num1, int num2);

//Sample Input:subtractNumbers(20, 5);
//             multiplyNumbers(4, 5);
//             divideNumbers(20, 4);

//findRemainder(10, 3);

//Sample Output:15
//              20
//              5.00
//              1

//Note:In the sample input, the numbers given to the 
//functions are (20, 5), (4, 5), (20, 4) and (10, 3) respectively. 
//The functions correctly return the results of 
//subtraction, multiplication, division and finding the remainder.
import java.util.Scanner;
public class ArithmeticOperations{
		public static void main(String []args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the first number");
			int a = scan.nextInt();
			System.out.println("enter the second number");
			int b = scan.nextInt();
			int c = substraction(a,b);
			double d = division(a,b);
			int e = multiplication(a,b);
			int f = remainder(a,b);
			System.out.println("The result of substraction num1 and num2 is : " +c);
			System.out.println("The result of division num2 and num1 is : " +d);
			System.out.println("The result of multiplication num1  and num2 is : " +e);
			System.out.println("The result of  remainder num1 and num2 is : " +f);
		}
		public static int substraction(int num1 , int num2)
		{
			 int c = num1 - num2;
			return c;
		}
		public static double division(int num2 , int num1)
		{
			 double d = num2 / num1;
			 return d;
			
		}
		public static int multiplication(int num1 , int num2)
		{
			int e = num1 * num2 ;
			return e;
		}
		public static int remainder(int num1 , int num2)
		{
			int f = num1 % num2;
			return f;
		}
}
		
				
			
		
			
			
			
			
			
		
		
	





