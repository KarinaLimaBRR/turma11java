package classes;

import java.util.Scanner;


//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)//
public class exercicio_FOR_2{ 

	
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in); 
		
		int par=1,n, contador=0, impar=1;
	
		//para//
		for(contador=0; contador<=10;contador++) 
		
		{
			System.out.println("Digite um n�mero de 1 a 10");
			n=leia.nextInt();
		
			if(n%2==0) 
			{
				System.out.println("Este n�mero � par"); par++; 
				
			} 	
			else 
			{
				System.out.println("Este n�mero � �mpar");impar++;
				
			}
			
		}System.out.println("quantidade de vezes que se repete n�mero par "+par);
		System.out.println("quantidade de vezes que se repete n�mero �mpar "+impar);
		leia.close();

}

}