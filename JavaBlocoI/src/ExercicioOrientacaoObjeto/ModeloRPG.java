package ExercicioOrientacaoObjeto;

import java.util.Scanner;

public class ModeloRPG
{

	
	Scanner input = new Scanner(System.in);
	
	//ATRIBUTO
	String nome;
	int lvl;
	int forca;
	int des;
	int intel;
	int sor;
	int vigor;
	int souls;
	int cont;
	
	
	//METODO CONSTRUTOR
	public ModeloRPG()
	{
		this.lvl = 1;
		this.forca = 1;
		this.des = 1;
		this.intel = 1;
		this.sor = 1;
		this.vigor = 1;
		this.souls = 0;
	}
	
	//METODO
	public void nomeChar()
	{
		System.out.print("Digite seu nickname: ");
		this.nome = input.nextLine();
	}
	
	public void altFor()
	{
		do
		{
		System.out.print("Digite o quanto quer adicionar na for�a: ");
		int coringa = this.forca;
		this.forca = input.nextInt() + this.forca;
		
		if(this.forca > coringa)
		{	
			this.cont = 0;
			this.cont++;
			if(this.lvl == 1)
			{
				this.lvl += this.forca;
				this.lvl -= 1;
			}
			else
				this.lvl += this.forca;
		}
		else
			this.forca = coringa;
		
		}while(cont == 0);
	}
	
	public void status()
	{
		System.out.println("O seu nome �: "+this.nome);
		System.out.println("O seu level �: "+this.lvl);
		System.out.println("O seu vigor �: "+this.vigor);
		System.out.println("A sua for�a �: "+this.forca);
		System.out.println("A sua destreza �: "+this.des);
		System.out.println("A sua intelig�ncia �: "+this.intel);
		System.out.println("A sua sorte �: "+this.sor);
		System.out.println("A sua souls �: "+this.souls);
	}
	
}
