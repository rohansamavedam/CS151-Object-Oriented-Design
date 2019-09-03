package gallonstoliters;

import java.util.Scanner;

public class GalToLit {
	private double gallons;
	
	public GalToLit(double gallons) {
		this.gallons = gallons;
	}
	
	public double convert() {
		return gallons * 3.785;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Provide the number of gallons to convert into liters: ");
		double gallons = scan.nextDouble();
		
		GalToLit conversion = new GalToLit(gallons);
		double liters = conversion.convert();
		
		System.out.println(liters);
		scan.close();
	}
}
