package Arrproject;

import java.util.Scanner;

public class SingleDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int[] a = new int[5]; // declaring an integer array with size 5
	      
	      // taking input from user and assigning it to array elements
	      System.out.println("Enter 5 numbers:");
	      for (int i = 0; i < a.length; i++) 
	      {
	         a[i] = sc.nextInt();
	      }
	      
	      // printing the values of array elements
	      System.out.println("Array elements are:");
	      for (int i = 0; i < a.length; i++) {
	         System.out.println("Element at index " + i + ": " + a[i]);
	      }

	}

}
