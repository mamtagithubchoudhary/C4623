package corejava1;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		
			System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Option 4");
            System.out.println("5. Option 5");
            System.out.println("6. Option 6");
            System.out.println("7. Option 7");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            n=sc.nextInt();
            switch(n)
            {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("You Exit");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                
            }
           
		

	}

	}


