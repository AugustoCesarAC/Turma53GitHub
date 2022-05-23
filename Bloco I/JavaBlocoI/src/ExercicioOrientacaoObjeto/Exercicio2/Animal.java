package ExercicioOrientacaoObjeto.Exercicio2;

public class Animal
{

	public String nome;
	public int idade;
	public String emitirSom;
	public boolean correrEscalar = false;
	
	public void verdadeiroCorrer()
	{
		correrEscalar = true;
	}
	
	public void fazSom()
	{
		emitirSom = "Faz som";
	}
	
	public void resutaldo()
	{
		System.out.println("Seu nome é: "+this.nome);
		System.out.println(this.idade+" Sua idade");
		System.out.println(this.emitirSom+ " Emite som");
	}
	
}
