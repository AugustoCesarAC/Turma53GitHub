package IntroducaoPOO.Heranca;

public class Gen
{

	public static void main(String[] args)
	{
		
		Pessoa pe = new Pessoa();
		Professor pr = new Professor();
		Aluno al = new Aluno();
		
		pe.idade=10;
		pr.aumento(50);
		al.aniversario();
		

	}

}
