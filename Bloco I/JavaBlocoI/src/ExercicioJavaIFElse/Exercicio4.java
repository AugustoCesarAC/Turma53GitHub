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
			System.out.println("O numero digitado é par, por isso, a raiz quadrada é: "+Math.sqrt(n1));
		else
			System.out.println("O numero digitado é impar, por isso, a potencia a 2 é: "+Math.pow(n1,2));
		
	}

}
