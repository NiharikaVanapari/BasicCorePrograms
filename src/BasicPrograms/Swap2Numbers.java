package BasicPrograms;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter 2nd number: ");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		System.out.println("Before Swapping: "+a+" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a+" "+b);

	}

}

