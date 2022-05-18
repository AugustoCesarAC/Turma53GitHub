package CalculadoraProjeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mostruario extends Valores
{

	public void menu() throws Exception {
		Scanner input = new Scanner(System.in);
		String condicao = " ";

		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n ===========================");
			sb.append("\n | Seja bem-vindo! Digite: |");
			sb.append("\n |                         |");
			sb.append("\n |     1 - Somar           |");
			sb.append("\n |     2 - Subtrair        |");
			sb.append("\n |     3 - Dividir         |");
			sb.append("\n |     4 - Multiplicar     |");
			sb.append("\n |     5 - Historico       |");
			sb.append("\n |     6 - Encerrar        |");
			sb.append("\n ===========================");
			sb.append("\nOpcão --> ");
			System.out.print(sb);
			condicao = input.next();

			switch (condicao) {

			case "1":
				System.out.println("Digite dois valores para Somar:");
				System.out.println(soma());
				break;
				
			case "2":
				System.out.println("Digite dois valores para Subtrair:");
				System.out.println(subtracao());
				break;
				
			case "3":
				System.out.println("Digite dois valores para Dividir:");
				divisao();
				break;
				
			case "4":
				System.out.println("Digite dois valores para Dividir:");
				System.out.println(mult());
				break;
				
			case "5":
				System.out.println("Até o momento, os calculos feitos foram:");
				System.out.println(getListHist());
				break;
				
			case "6":
				System.out.println("Programa finalizado.");
				break;
				
			default:
				System.out.println("Opção inválida! Encerrando programa.");
				break;

			}

		} while (!condicao.equals("6"));
	}
	
}
