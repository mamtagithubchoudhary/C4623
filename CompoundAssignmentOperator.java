package Operators;

import java.util.Scanner;

public class CompoundAssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2=sc.nextInt();
		num1+=num2;
		System.out.println("+= Operator result is" + num1);
		//-+ Operator
		num1-=num2;
		System.out.println("-= Operator result is" + num1);
		//*= operator
		num1*=num2;
		System.out.println("*= Operator result is" + num1);
		// /= Operator
		num1/=num2;
		System.out.println("/= Operator result is" + num1);
		num1%=num2;
		System.out.println("%= Operator result is" + num1);
		sc.close();
	}

}
