package classes;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/

public class exercicio1_FOR
{

	public static void main(String[] args)
	{
	
		
		//contador=contador+1//
		for(int contador=1000;contador<=1999;contador++)
		{
		if (contador%11==5) {	
		System.out.println( contador+ " este numero tem como restante 5 ");	
		}
		
		

		}
	}
}
