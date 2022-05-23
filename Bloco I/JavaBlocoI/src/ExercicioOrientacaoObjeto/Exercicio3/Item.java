package ExercicioOrientacaoObjeto.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Item
{

	Scanner input = new Scanner(System.in);
	ArrayList<String> item = new ArrayList<>();
	String armazenar = "";
	int posicao = 0;
	
	public void adicionar()
	{
		System.out.println("Adicione o item: ");
		this.armazenar = input.nextLine();
		this.item.add(this.armazenar);
	}
	
	public void remover()
	{
		System.out.println("Selecione qual você quer remover: ");
		showList();
		this.posicao = input.nextInt() - 1;
		this.item.remove(this.posicao);
	}
	
	public void atualizar()
	{
		System.out.println("Atualize a lista, selecione qual item quer alterar e digite a alteração");
		showList();
		this.posicao = input.nextInt() - 1;
		item.set(this.posicao, input.next());
	}
	
	public void showList()
	{
		System.out.println(item.size());
		System.out.println(item);
	}
	
	
	
}
