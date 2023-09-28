package test;
/*
 * 2. Write a program to Menu driven program using switch statement 
 * ( Find addition, subtraction, multiplication and division of to integer numbers )
 */
import java.util.Scanner;

public class ManuDrivenUsingSwitchCase {
	public static void main(String[] args) {
		int choice;
		Scanner s = new Scanner(System.in);
		int n1,n2;
		
		/*
		 * Use while loop for choose user option.
		 */
		while(true) {
			System.out.println("Enter 1 for addition: " );
			System.out.println("Enter 2 for substraction: ");
			System.out.println("Enter 3 for division: ");
			System.out.println("Enter 4 for multiplication: ");
			System.out.println("Enter 5 for terminate the loop: ");
			
			
			choice = s.nextInt();
			//Switch case for choice a particular option.
			switch(choice) {
			case 1:
				System.out.println("Enter the first number: ");
				n1 = s.nextInt();
				System.out.println("Enter the second number: ");
				n2 = s.nextInt();
				System.out.println("Sum of two number : "+add(n1,n2));
				break;
			case 2:
				System.out.println("Enter the first number: ");
				n1 = s.nextInt();
				System.out.println("Enter the second number: ");
				n2 = s.nextInt();
				System.out.println("Difference between two number : "+sub(n1,n2));
				break;
			case 3:
				System.out.println("Enter the first number: ");
				n1 = s.nextInt();
				System.out.println("Enter the second number: ");
				n2 = s.nextInt();
				System.out.println("Division of two number : "+div(n1,n2));
				break;
			case 4:
				System.out.println("Enter the first number: ");
				n1 = s.nextInt();
				System.out.println("Enter the second number: ");
				n2 = s.nextInt();
				System.out.println("Sum of two number : "+mul(n1,n2));
				break;
			case 5:
				System.exit(0);
			
			default:
				System.out.println("Please choose correct option.");;
			}
		}
		
	}

	//Method for sub.
	private static int sub(int a, int b) {
		return ( a - b);
		
	}
	
	//Method for div.
	private static int div(int a, int b) {
		return (a / b);
		
		
	}

	//Method for mul.
	private static int mul(int a, int b) {
		return ( a * b);
		
	}

	//Method for add.
	private static int add(int a, int b) {
		return (a + b);
		
		
	}
}
