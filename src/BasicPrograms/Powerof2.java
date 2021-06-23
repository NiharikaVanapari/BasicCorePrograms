package BasicPrograms;

import java.util.Scanner;

public class Powerof2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		s.close();
		int n=s.nextInt();
		int power=1;
		if(n>=0&&n<31)
		{
			for(int i=1;i<=n;i++)
			{
				power=power*2;
				System.out.println("Power of the given number is: "+power);
			}
			
		}
		else
			System.out.println("number exceeds limit");
	}
}
