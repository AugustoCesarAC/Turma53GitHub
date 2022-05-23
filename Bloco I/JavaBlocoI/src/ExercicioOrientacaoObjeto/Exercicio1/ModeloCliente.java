package ExercicioOrientacaoObjeto.Exercicio1;

public class ModeloCliente
{

	//ATRIBUTOS
	String nome;
	String sobreNome;
	int idade;
	int cod;
	double valorObjeto;
	boolean credDeb;
	//boolean interesse;
	
	//MÉTODO CONSTRUTOR
	
	public ModeloCliente(int c, double v)
	{
		this.idade = 5;
		this.cod = c;
		this.valorObjeto = v;
	}
	
	//METODOS
	
	public void objeto()
	{
		System.out.printf("O valor do objeto foi de R$%.2f%n",this.valorObjeto);
	}
	
	public void credito()
	{
		this.credDeb = true;
		System.out.println("Pagamento em credito");
	}
	
	public void debito()
	{
		this.credDeb = false;
		System.out.println("Pagamento em debito");
	}
	
	public void status()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+this.sobreNome);
		System.out.println("idade: "+this.idade);
	}
	
	
}
