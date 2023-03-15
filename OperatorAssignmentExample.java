package Operators;

import java.util.Scanner;

public class OperatorAssignmentExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum:"+sum);
		
		//Substraction 
		int sub=num1-num2;
		System.out.println("Sub:"+sub);
		
		//Multiplication
		int mul=num1*num2;
		System.out.println("Multiplication:"+mul);
		
		//Division
		int div=num1/num2;
		System.out.println("Division:"+div);
		
		//Modulus
		int mod=num1%num2;
		System.out.println("Modulus:"+mod);
		sc.close();
	}

}
