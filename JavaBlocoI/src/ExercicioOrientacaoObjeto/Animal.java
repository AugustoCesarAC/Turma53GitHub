package ExercicioOrientacaoObjeto;

public class Animal
{

	public String nome;
	public int idade;
	public boolean emitirSom = false;
	public boolean correrEscalar = false;
	
	public void verdadeiroCorrer()
	{
		correrEscalar = true;
	}
	
	public void fazSom()
	{
		emitirSom = true;
	}
	
	public void resutaldo()
	{
		System.out.println("Seu nome é: "+this.nome);
		System.out.println(this.idade+" Sua idade");
		System.out.println(this.emitirSom+ " Emite som");
	}
	
}
