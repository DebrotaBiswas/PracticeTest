package test;
/*
 * 1. Write a program to find the sum of even numbers between 25 to 51.
 */
import java.util.Scanner;

public class SumOfEvenNum {
	public static void main(String[] args) {
		
		//Scanner class for taking user input.
		Scanner s = new Scanner(System.in);
		//for store all the even number sum.
		int sum = 0;
		
		//Taking starting range from the user.
		System.out.println("enter the first number: ");
		int start = s.nextInt();
		
		//Taking end range from the user.
		System.out.println("enter the second number: ");
		int end = s.nextInt();
		s.close();
		//calculation sum of all even number from the given range.
		
		for(int i = start; i <= end; i++) {
			if(i%2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of all even number between"+start+ "to" + end +"is :" +sum);
	}
}
