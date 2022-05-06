package Introducao;

import java.util.Scanner;

public class EntraESaida
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite o primeiro valor: ");
		n1 = input.nextInt();

		System.out.print("Digite o segundo valor: ");
		n2 = input.nextInt();
		
		System.out.print("\nA soma é: "+ (n1+n2));
	}

}
