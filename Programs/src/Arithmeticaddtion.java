//Question: 1 Problem: Galactic Arithmetic

//  In a far-off galaxy named Arithmetica, beings have been using a 
//  newly discovered number system to make their life easier. 
//  However, they are facing difficulties in performing basic arithmetic operations. 
//  As the resident genius of planet Earth, you have been called upon to help them. 
// Your first task is to build a function that will be able to 
//  add two numbers in their number system.

//Function:public static long galacticAddition(long num1, long num2);

//Sample Input:125678
//             9876543210L

//Sample Output:9876668888L

//Note:

//In the sample input, the two numbers provided to the function are 125678 and 9876543210. 
//The sum of these two numbers is 125678+9876543210=9876668888, 
//so the function returns 9876668888 as the output. 
//Your task is to help the beings of Arithmetica perform this basic
import java.util.Scanner;
public class Arithmeticaddtion {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1");
		long a = scan.nextLong();
		System.out.println("Enter the num2");
		long b = scan.nextLong();
		long res = add(a,b);
		System.out.println("The sum of  num1 and num2 " +res);
		
	}
	public static long add(long num1,long num2) 
	{
		long z = num1+num2;
		return z;
		
	}
}

	


	
	
		
	
		
		
		
		
	


