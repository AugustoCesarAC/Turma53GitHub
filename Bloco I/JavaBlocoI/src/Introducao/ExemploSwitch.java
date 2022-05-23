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
		System.out.println("\nDigite:\n1-soma\n2-subtração\n3-multiplicação\n4-divisão");
		System.out.print("\nQual opção será selecionada? ");
		opcao = input.nextInt();
		
		switch (opcao)
		{
		case 1:
		{
			n1 += n2;
			System.out.print("A soma é: "+n1);
			break;
		}
		case 2:
		{
			n1 -= n2;
			System.out.print("A subtração é: "+n1);
			break;
		}
		case 3:
		{
			n1 *=n2;
			System.out.print("A multiplicação é: "+n1);
			break;
		}
		case 4:
		{
			if(n2==0)
				System.out.println("ERRO!!! Não é possivel dividir por 0");
			else
			{
				n1 /= n2;
				System.out.print("A divisão é: "+n1);				
			}
			break;
		}
		default:
			System.out.println("Opção inválida!");
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
	}
	
}
