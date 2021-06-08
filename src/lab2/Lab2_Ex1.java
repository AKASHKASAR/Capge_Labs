package lab2;

import java.util.Scanner;

public class Lab2_Ex1 
{
	
		static int secondSmallest(int Array[])
		{
			 int First , Second;
			 if(Array.length < 2)
			 {
				 return Integer.MAX_VALUE;
			 }
			 
			 First = Second = Integer.MAX_VALUE;
			 
			 for(int I=0; I<Array.length; I++)
			 {
				 if(Array[I] < First)
				 {
					 Second = First;
					 First = Array[I];
				 }
				 else if((Array[I] < Second) && (Array[I] != First))
				 {
					 Second = Array[I];
				 }
			 }
			 
			 if(Second == Integer.MAX_VALUE)
			 {
				 return Integer.MAX_VALUE;  
			 }
			 else
			 {
				 return Second;
			 }
		}

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of Array:");
			
			int size = sc.nextInt();
			
			int A = 0;
			
			int arr[] = new int[size];
			 
			for(int i=0; i<size;i++) 
			{
				System.out.print("Enter Element " + (i+1) + " : " );
				arr[i] = sc.nextInt();
			}
			
			A = secondSmallest(arr);
			
			if(A != Integer.MAX_VALUE)
			{
				System.out.println(A);
			}
			else
			{
				System.out.println("There is No Second Smallest Number");
			}
			
			sc.close();
			
	}

}
