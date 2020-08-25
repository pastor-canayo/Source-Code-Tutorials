import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int age = 0;
		
		System.out.println("Enter your age: ");
		age = in.nextInt();
		
		if(age > 16) {
			System.out.println("You are ready to start driving.");
		}
		else {
			System.out.println("You are not ready to start driving.");
		}
	}

}
