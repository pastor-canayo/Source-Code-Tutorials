import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numOfTickets = 0;
		int adults, kids;
		int adultTicketsPrice = 12;
		int kidsTicketsPrice = 8;
		
		System.out.println("Welcome to the movie theater\n\n");
		System.out.println("It is $" + adultTicketsPrice + " per adult.");
		System.out.println("It is $" + kidsTicketsPrice + " per kids."); 
		
		//getting the user input for the tickets
		System.out.println("How many tickets do you want?");
		numOfTickets = in.nextInt();
				
		System.out.println("How many adults and kids?");
		adults = in.nextInt();
		kids = in.nextInt();
		
		//calculation of the adult tickets
		double priceAdults = adults * adultTicketsPrice * 0.03;
		double calNumAndAdult = adults * adultTicketsPrice;
		double  totalPriceAdults = calNumAndAdult + priceAdults;
		
		//calculation of the kid tickets
		double priceKids = kids * kidsTicketsPrice * 0.03;
		double calNumAndKids = kids * kidsTicketsPrice;
		double  totalPriceKids = calNumAndKids + priceKids;
			
		System.out.println("The total  price for " + adults + " adults tickets is " + totalPriceAdults);
		System.out.println("The total  price for " + kids + " adults tickets is " + totalPriceKids);
		System.out.println("The total  price for " + numOfTickets + " is " + (totalPriceAdults + totalPriceKids));
	}// end main

}// end class
