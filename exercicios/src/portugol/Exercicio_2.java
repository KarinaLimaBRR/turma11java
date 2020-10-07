package portugol;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anos, meses, dias, idadeEmDias = 0;
		
		System.out.println("Informe a sua idade em");
		
		System.out.print("Anos: ");		
		anos = teclado.nextInt();
		
		System.out.print("Meses: ");
		meses = teclado.nextInt();
		
		System.out.print("Dias: ");
		dias = teclado.nextInt();
		idadeEmDias = (anos * 365) + (meses * 30) + dias;		
		
		System.out.println("A sua idade em dias é " + idadeEmDias + " dias.");	
		
		teclado.close();

	}

}