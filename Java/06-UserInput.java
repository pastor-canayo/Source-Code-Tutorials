import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String name = "";
		int age  = 0;
		double dogWeight = 0.0;
		
		System.out.println("What is your name?");
		name = in.nextLine();
			
		System.out.println("How old are you?");
		age = in.nextInt();
		
		System.out.println("What is your dog's weight?");
		dogWeight = in.nextDouble();
		
		System.out.println("Hello, " + name + ".");
		System.out.println(age + " is a great age.");
		System.out.println(dogWeight + " is a good weight for a dog to keep it healthy.");
	}

}
