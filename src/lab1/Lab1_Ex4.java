package lab1;

import java.util.Scanner;

public class Lab1_Ex4 {

	public static boolean primeNot(int num){
		// TODO Auto-generated method stub
		
		//check if number<=1 ;
		if(num<=1) {
			return false;
		}
		
		//check if num==2
		else if(num==2) {
			return true;
		}
		
		//checking for multiple of 2
		else if(num%2==0) {
			return false;
		}
		
		//check condition for odd digit
		for(int i=3;i<Math.sqrt(num);i+=2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(primeNot(num)) {
			System.out.println("Prime Number");
		}
		else
			System.out.println("No a Prime Number");

	}
}
