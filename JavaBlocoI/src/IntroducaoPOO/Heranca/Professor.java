package IntroducaoPOO.Heranca;

public class Professor extends Pessoa
{

	public String modulo;
	public double salario;
	
	public void aumento(double n)
	{
		this.salario = this.salario+n;
	}
	
}
