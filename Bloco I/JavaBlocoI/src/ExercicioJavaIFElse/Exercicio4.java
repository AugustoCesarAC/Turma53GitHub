package ExercicioJavaIFElse;

import java.util.Scanner;

public class Exercicio4
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1;
		
		System.out.print("Digite um numero: ");
		n1 = input.nextInt();
		
		if(n1%2==0)
			System.out.println("O numero digitado � par, por isso, a raiz quadrada �: "+Math.sqrt(n1));
		else
			System.out.println("O numero digitado � impar, por isso, a potencia a 2 �: "+Math.pow(n1,2));
		
	}

}
