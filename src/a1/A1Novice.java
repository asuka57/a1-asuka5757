package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		
		String[] firstNames = new String[count];
		String[] lastNames = new String[count];
		double[] totalPrice = new double[count];
		
		for (int i=0; i<count; i++ ) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int amountOfItems = scan.nextInt();
			
			for (int x=0; x < amountOfItems; x++) {
				int numberOfItems = scan.nextInt();
				String name = scan.next();
				totalPrice[i] += numberOfItems * scan.nextDouble();

				
				
			}
		}
		
		for (int i=0; i < count; i++) {
			System.out.print(firstNames[i].charAt(0)+". " + lastNames[i] + ": " + totalPrice[]);
		}
		
		scan.close();
		
		

		}
		
}
