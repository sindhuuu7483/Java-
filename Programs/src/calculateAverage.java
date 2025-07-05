//Question: 3 Problem: The Double Trouble

//You are participating in a coding competition at your school. 
//The challenge is to create a function that can double the 
//value of any number provided. 
//This function will help in the game design where scores need to be 
//doubled under certain conditions.

//Function:public static int doubleTheNumber(int num);

//Sample Input:doubleTheNumber(15);

//Sample Output:30

//Note:In the sample input, the number given to the function is 15. 
//The double of this number is 15*2=30, so the function returns 30 as the output. 
//Your function should work accurately to make sure you win this competition. 
import java.util.Scanner;
public class calculateAverage {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of sem1 ");
		int a = scan.nextInt();
		System.out.println("Enter the marks of sem2 ");
		int b = scan.nextInt();
		System.out.println("Enter the marks of sem3 ");
		int c = scan.nextInt();
		System.out.println("Enter the marks of sem4 ");
		int d = scan.nextInt();
		System.out.println("Enter the marks of sem5 ");
		int e = scan.nextInt();
		System.out.println("Enter the marks of sem6 ");
		int f = scan.nextInt();
		System.out.println("Enter the marks of sem7 ");
		int g = scan.nextInt();
		System.out.println("Enter the marks of sem8 ");
		int h = scan.nextInt();
		int res = CalucalateAverage(a,b,c,d,e,f,g,h);
		System.out.println("The average of sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8 : " +res);
	}
	public static int CalucalateAverage(int p,int q ,int r,int s,int t,int u,int v,int w)
	{
		int z = (p+q+r+s+t+u+v+w)/8;
		return z;
	}
}
	
	


	




