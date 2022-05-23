package Introducao;

import java.util.Scanner;

public class ExemploIf
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1, idade;
		
		System.out.print("Digite um numero: ");
		n1 = input.nextInt();
		
		if(n1%2==0)
			System.out.println("O numero digitado é par");
		else
			System.out.println("O numero digitado é impar");
		
		System.out.print("\nDigite sua idade: ");
		idade = input.nextInt();
				
		if(idade >= 0 && idade <=13)
			System.out.println("Criança");
		else if(idade > 13 && idade <=21)
			System.out.println("Adolescente");
		else
			System.out.print("Adulto");
	}

}
