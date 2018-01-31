package Computer;

import java.util.Scanner;

public class ComputerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Computer dell = new Computer("Dell", "Latitude", 500.00);
		Computer mac = new Computer("Mac", 1000.00);

		System.out.println(dell.getBrand());
		System.out.println(dell.getModel());
		System.out.println(dell.getPrice());
		dell.setPrice(350.00);
		System.out.println("Dell went on sale for " + dell.getPrice());

		System.out.println(dell); // references toString()
		System.out.println("Brand: " + mac.getBrand() + " Price: " + mac.getPrice());

		if (dell.isDownloading()) {
			System.out.println("Your dell is busy downloading...");
		}

		System.out.println("Creating our own computer");
		System.out.println("Enter the Brand of your computer:");
		String myBrand = input.nextLine();
		System.out.println("Enter the Model of your computer:");
		String myModel = input.nextLine();
		System.out.println("How much did you pay for this computer?");
		double myPrice = input.nextDouble();

		Computer myComputer = new Computer(myBrand, myModel, myPrice);
		System.out.println("You just made a " + myComputer);

		input.close();
	}

}