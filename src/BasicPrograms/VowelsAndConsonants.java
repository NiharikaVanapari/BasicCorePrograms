package BasicPrograms;

import java.util.Scanner;

public class VowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter single aplhabet: ");
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch+" is a vowel");
		else
			System.out.println(ch+" is a Consonant");
		
	}

}
