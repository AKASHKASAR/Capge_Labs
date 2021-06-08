package lab1;

public class Lab1_Ex7_2 
{
	
	static int Number = 1232;
	
	public static void main(String[] args) 
	{
	
		int Digit = Number % 10;
		Number /= 10;
		
		boolean Flag = false;
		
		while(Number > 0)
		{
		
			if(Digit < (Number % 10))
			{
				Flag = true;
				System.out.println(Number + " " + Flag + " " + Digit + " " + (Number % 10));
			}
			
			
			Digit = Number % 10;
			Number /= 10;
			
			System.out.println(Number + " " + Digit);
			
		}
		
		
		if(!Flag)
		{
			System.out.println("Number is In Increasing Order");
		}
		else
		{
			System.out.println("Number is Not In Increasing Order");
		}
	}
}
