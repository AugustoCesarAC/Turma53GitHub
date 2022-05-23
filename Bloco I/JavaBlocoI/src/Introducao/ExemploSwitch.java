package Introducao;

import java.util.Scanner;

public class ExemploSwitch
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double n1,n2;
		int opcao;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = input.nextDouble();
		System.out.print("Digite o segundo numero: ");
		n2 = input.nextDouble();
		System.out.println("\nDigite:\n1-soma\n2-subtra��o\n3-multiplica��o\n4-divis�o");
		System.out.print("\nQual op��o ser� selecionada? ");
		opcao = input.nextInt();
		
		switch (opcao)
		{
		case 1:
		{
			n1 += n2;
			System.out.print("A soma �: "+n1);
			break;
		}
		case 2:
		{
			n1 -= n2;
			System.out.print("A subtra��o �: "+n1);
			break;
		}
		case 3:
		{
			n1 *=n2;
			System.out.print("A multiplica��o �: "+n1);
			break;
		}
		case 4:
		{
			if(n2==0)
				System.out.println("ERRO!!! N�o � possivel dividir por 0");
			else
			{
				n1 /= n2;
				System.out.print("A divis�o �: "+n1);				
			}
			break;
		}
		default:
			System.out.println("Op��o inv�lida!");
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
	}
	
}
