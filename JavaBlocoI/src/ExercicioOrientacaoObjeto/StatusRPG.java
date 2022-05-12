package ExercicioOrientacaoObjeto;

import java.util.Scanner;

public class StatusRPG
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
	public StatusRPG()
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
	
	
	
	public int loopLvl()
	{
		int x=0;
		do
		{
	
		System.out.print("Digite o quanto quer adicionar no status: ");
		x = input.nextInt();
		
		if(x > 0)
		{	
			this.cont = 0;
			this.cont++;
			this.lvl += x;
		}
		}while(cont == 0);
		return x;
	}

	
	public void altFor()
	{
		System.out.println("Aumento de força");
		int x = this.loopLvl();
		this.forca = x + this.forca;
		System.out.println("");
	}
	
	public void altDes()
	{
		System.out.println("Aumento de destreza");
		int x = this.loopLvl();
		this.des = x + this.des;
		System.out.println("");
	}
	
	public void altVig()
	{
		System.out.println("Aumento de vigor");
		int x = this.loopLvl();
		this.vigor = x + this.vigor;
		System.out.println("");
	}
	
	public void altInt()
	{
		System.out.println("Aumento de inteligência");
		int x = this.loopLvl();
		this.intel = x + this.intel;
		System.out.println("");
	}
	
	public void altSor()
	{
		System.out.println("Aumento de sorte");
		int x = this.loopLvl();
		this.sor = x + this.sor;
		System.out.println("");
	}
	
	
	public void status()
	{
		System.out.println("O seu nome é: "+this.nome);
		System.out.println(this.lvl+" LVL");
		System.out.println(this.vigor+" Vigor");
		System.out.println(this.forca+" Força");
		System.out.println(this.des+" Destreza");
		System.out.println(this.intel+" Inteligência");
		System.out.println(this.sor+" Sorte");
	}
	
	
}
