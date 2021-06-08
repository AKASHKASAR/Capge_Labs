package lab1;

public class Lab1_Ex7_1 
{
	
	public static void main(String[] args) 
	{
		
		int Number = 123345789;
		
		boolean Flag = false;
		
		String A = Integer.toString(Number);
		
		
		for(int I =0; I<A.length() -1; I++)
		{
			    if(A.charAt(I) <= A.charAt(I + 1))
				{
					Flag = true;
				}
				else
				{
					Flag = false;
					break;
				}
								
		}
		
		
		if(Flag)
		{
			System.out.println(Number +"Number is In Increasing Order");
		}
		else
		{
			System.out.println("Number is In Not Increasing Order");
		}
		
	}
	
}
