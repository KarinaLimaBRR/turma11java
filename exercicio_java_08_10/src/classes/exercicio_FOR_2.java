package classes;

import java.util.Scanner;


//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)//
public class exercicio_FOR_2{ 

	
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in); 
		
		int par=1,n, contador=0, impar=1;
	
		//para//
		for(contador=0; contador<=10;contador++) 
		
		{
			System.out.println("Digite um número de 1 a 10");
			n=leia.nextInt();
		
			if(n%2==0) 
			{
				System.out.println("Este número é par"); par++; 
				
			} 	
			else 
			{
				System.out.println("Este número é ímpar");impar++;
				
			}
			
		}System.out.println("quantidade de vezes que se repete número par "+par);
		System.out.println("quantidade de vezes que se repete número ímpar "+impar);
		leia.close();

}

}