package corejava1;

import java.util.Scanner;

public class PositiveNumber {
	public static void main(String[] args) {
		// Creating Scanner to take input from user
		int i;
		int a;
		// Creating Scanner to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number Upto which you want to print even number:");
		a=sc.nextInt();
		i=2;
		while(i<=a)  
		{  
		//prints the even number  
		System.out.print(i +" ");   
		//increments the variable i by 2  
		i=i+2; 
		}
	}

}
