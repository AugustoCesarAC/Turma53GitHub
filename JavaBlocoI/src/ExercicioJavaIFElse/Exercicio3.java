package ExercicioJavaIFElse;

import java.util.Scanner;

public class Exercicio3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int idade;
		
		System.out.print("\nDigite sua idade: ");
		idade = input.nextInt();
				
		if(idade >= 10 && idade <=14)
			System.out.println("Criança");
		else if(idade > 14 && idade <=17)
			System.out.println("Adolescente");
		else if(idade > 17 && idade <=25)
			System.out.print("Adulto");
		else
			System.out.println("Idade fora do medido");
		
	}

}
