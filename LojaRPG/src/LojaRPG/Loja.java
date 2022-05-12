package LojaRPG;

public class Loja
{

	Item item = new Item();
	
	public double caixaLoja;// DINHEIRO NO CAIXA
	public int espacoLoja;// TAMANHO A DEFINIR DA LOJA
	public int metroQuadro[];// METRO QUADRADO DA LOJA
	public Item produto[];//PRODUTOS DIVERSOS
	public double especimeCobre;//A MOEDA DO LOCAL
	
	//METODO CONSTRUTOR
	public Loja()
	{
		this.caixaLoja = 2000.50;
		this.item = new Item();
	}
	
	
	
	public void comprar()
	{
		
	}
	
	public void vender()
	{
		
	}
	
	public void adicionar()
	{
		
	}
	
	public void remover()
	{
		
	}
	
	public void catalogoLoja()
	{
		System.out.println(this.item);
	}
	
	
	
}
