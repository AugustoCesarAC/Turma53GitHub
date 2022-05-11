package IntroducaoPOO;

public class ModeloCaneta
{

	//CARACTERISTICAS -> ATRIBUTOS
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	//MÉTODO CONSTRUTOR
	
	public ModeloCaneta(String c, double p)
	{
		this.cor = c;
		this.ponta = p;
		this.carga = 100;
		this.tampada = true;
	}
	
	//COMPORTAMENTO -> MÉTODOS
	
	public void escrever()
	{
		if(this.tampada == true)
			System.out.println("Erro! A caneta está tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("A carga esta em: "+this.carga+"%");
		System.out.println("Esta tampada? "+this.tampada);
	}
	
	
}
