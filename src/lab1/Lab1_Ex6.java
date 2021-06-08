package lab1;

import java.util.Scanner;

public class Lab1_Ex6 {
	
	static void calcdiff(int diff) {
		
		int i = 0;
		int j = 0;
		
		
		for(i=0;i<diff;i++)
		{
			 i= (i^2)+1;
			i++;
					  
		}
		
		for(j=0;j<diff;j++) {
			
			j = (j+1)^2;
		}
		
		
		System.out.println(i);
		System.out.println(j);
		
		int k = i+j;
		System.out.println(k);
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER ANY NO.:" );
		
		int diff = sc.nextInt();
		
		Lab1_Ex6 cd = new Lab1_Ex6();
		cd.calcdiff(diff);
		
	}

}
