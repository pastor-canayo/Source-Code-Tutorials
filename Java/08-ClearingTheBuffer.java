import java.util.Scanner;

public class ClearingTheBuffer {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int luckyNumber = 0;
		int yearBorn = 0;
		String name = "";
		
		System.out.println("Enter your lucky number: ");
		luckyNumber = in.nextInt();
		
		System.out.println("Enter the year you were born: ");
		yearBorn = in.nextInt();
		
		in.nextLine();
		
		System.out.println("Enter your name: ");
		name = in.nextLine();
		
		System.out.println("Your lucky number is: " + luckyNumber);
		System.out.println(name + " you are " + (2020 - yearBorn) + " years old.");
		

	}// end main

}// end class
