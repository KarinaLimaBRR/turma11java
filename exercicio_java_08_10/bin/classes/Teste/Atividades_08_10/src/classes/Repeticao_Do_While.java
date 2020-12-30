package classes;

import java.util.Scanner;

public class Repeticao_Do_While {

	public static void main(String[] args)
	{
		int x = 0;
		Scanner leia = new Scanner(System.in);
		do 	{
				System.out.println("Digite um número: ");
				x = leia.nextInt();
			} while (x <= 1000);	
		
		leia.close();
	}

}
