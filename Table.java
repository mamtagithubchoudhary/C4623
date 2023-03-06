package corejava1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from user
	        Scanner sc = new Scanner(System.in); 
			System.out.println("Enter any number to print its table");
			//Creating a variable using scanner class object
			int num=sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
			}
		}

	}


