package classes;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x <= 10; x++) {
			System.out.println();
			System.out.println("Tabuada: ");
			System.out.println("***********");
			for (int y = 0; y <= 10; y++) {
				
				System.out.println(x + " X " + y + " = " + (x*y));
				
			}
		}
		
		
		
		
		
		
		leia.close();

	}

}
