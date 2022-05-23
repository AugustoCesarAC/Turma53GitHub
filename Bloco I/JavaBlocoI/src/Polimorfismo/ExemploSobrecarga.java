package Polimorfismo;

public class ExemploSobrecarga
{

	private int calc;
	
	public int soma(int n1, int n2)
	{
		this.calc = n1+n2;
		return this.calc;
	}
	
	public int soma(int n3)
	{
		this.calc = n3;
		return this.calc;
	}
	
	public void print()
	{
		System.out.println(this.calc);
	}
	
}
