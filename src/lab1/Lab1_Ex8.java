package lab1;

import java.util.Scanner;

public class Lab1_Ex8 

{
	
	static boolean powerof2(int n)
	{
		
		if(n==0)
		{
			return false;
		}
		
		
		while(n != 1)
		{
			if((n %3) != 0)
			{
				return false;
			}
			
			n /= 3;
			System.out.println(n);
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args)
	{
	
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		
		int N = Input.nextInt();
		
		if(powerof2(N) ==  true)
		{
			System.out.println("Number is Power Of 2");
		}
		else
		{
			System.out.println("Number is Not Power Of 2");
		}
		
	
	}
	
	


}
