package portugol;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int duracaoEvento, horas = 0, minutos = 0, segundos = 0;
		
		System.out.print("Informe a duração do evento (em segundos): ");
		duracaoEvento = teclado.nextInt();
		horas = duracaoEvento / 3600;
		minutos = (duracaoEvento % 3600)/ 60;
		segundos = (duracaoEvento % 3600) % 60;
		System.out.print("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
				
		teclado.close();
		
	}

}