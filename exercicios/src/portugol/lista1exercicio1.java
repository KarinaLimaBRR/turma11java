package portugol;

import java.util.Scanner;

public class lista1exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int anos,meses,dias;
		int totalDias=0;
		/* 
		 * funcao inicio()
	{
		inteiro anos, meses, dias, idadeEmDias = 0

		escreva("Informe a sua idade")
		escreva("\nAnos: ")
		leia(anos)
		escreva("\nMeses: ")
		leia(meses)
		escreva("\nDias: ")
		leia(dias)

		idadeEmDias = (anos * 365) + (meses * 30) + dias

		escreva("A sua idade em dias é " + idadeEmDias + " dias.")
		
	}
}
		 */
		
		System.out.print("informe sua idade: ");
		System.out.print("\nAnos: ");
		anos=leia.nextInt();
		System.out.print("\nMeses: ");
		meses=leia.nextInt();
		System.out.print("\nDias: ");
		dias=leia.nextInt();
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.print("A sua idade em dias é " + totalDias + " dias.");
		
	}

}
