import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		int a = 0;
		int b = 0;
		int total = 0;
		char letter;
		
		System.out.println("Welcome to my basic calculator\n");
		System.out.println("Enter the follwoing letters for the operations: ");
		System.out.println("a = addition");
		System.out.println("b = substraction");
		System.out.println("c = multiplication");
		System.out.println("d = division\n");
		
		System.out.println("Enter the first number: ");
		a = in.nextInt();
		System.out.println("Enter the second number: ");
		b = in.nextInt();
		
		System.out.println("Enter a letter: ");
		letter = in.next().charAt(0);
		
		System.out.println("You entered letter " + letter);
		if(letter == 'a') {
			System.out.println("Which it will be addition ");
			System.out.println("the operation of " + a + " + " + b);
			total = a + b;
		}
		else if(letter == 'b') {
			System.out.println("Which it will be susbtraction ");
			System.out.println("the operation of " + a + " - " + b);
			total = a - b;
		}
		else if(letter == 'c') {
			System.out.println("Which it will be multiplication ");
			System.out.println("the operation of " + a + " * " + b);
			total = a * b;
		}
		else if(letter == 'd') {
			System.out.println("Which it will be division ");
			System.out.println("the operation of " + a + " / " + b);
			total = a / b;
		}
		else {
			total = 0;
		}
		System.out.println("The total is : " + total);
		

	}

}
