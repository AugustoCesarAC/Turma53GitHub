package LojaRPG;

public class Item
{

	public String nome;
	public double valorItem;
	public double peso;
	
	//METODO CONSTRUTOR
	public Item()
	{
		this.nome = "Armadura";
		this.valorItem = 50;
		this.peso = 3;
	}
	
	@Override
	public String toString()
	{
		return nome;
	}
	
}
