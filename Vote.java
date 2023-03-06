package corejava1;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args)
	{
		//Creating a scanner class to take input from user
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter any age to find vote can give or not");
		//Creating a variable using scanner class object
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else if(age<17)
		{
			System.out.println("Wait for 1 more year for vote ");
		}
		else
		{
			System.out.println("You cannot vote");
		}
        sc.close();

	}

}
