package ExercicioOrientacaoObjeto.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja
{

	public static void main(String[] args)
	{
		
		ArrayList<String> item = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		Item it = new Item();
		String condicao = " ";

		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  ===========================");
			sb.append("\n | Seja bem-vindo! Digite:   |");
			sb.append("\n |                           |");
			sb.append("\n |     1 - Adicionar         |");
			sb.append("\n |     2 - Remover           |");
			sb.append("\n |     3 - Atualizar         |");
			sb.append("\n |     4 - Apresentar lista  |");
			sb.append("\n |                           |");
			sb.append("\n  ===========================");
			sb.append("\nOpcão --> ");
			System.out.print(sb);
			condicao = input.next();
			System.out.println(condicao);

			switch (condicao) {

			case "1":
				System.out.println("Adicionar selecionado");
				it.adicionar();
				break;
			case "2":
				System.out.println("Remover selecionado");
				it.remover();
				break;
			case "3":
				System.out.println("Atualizar selecionado");
				it.atualizar();
				break;
				
			case "4":
				System.out.println("Apresentar lista selecionado");
				it.showList();
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;

			}

		} while (!condicao.equals("0"));
		
	}
	
}
