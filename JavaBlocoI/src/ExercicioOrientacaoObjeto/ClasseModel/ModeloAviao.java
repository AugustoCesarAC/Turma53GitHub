package ExercicioOrientacaoObjeto.ClasseModel;

public class ModeloAviao
{

	//ATRIBUTOS
	
	String modelo;
	double velocidadeMax;
	double altMax;
	double precoAviao;
	boolean nIn;
	int capacidadeTanque;
	int assentosMax;
	
	
	//METODO CONSTRUTOR
	
	public ModeloAviao()
	{
		velocidadeMax = 800;
		altMax = 3000;
	}
	
	
	//METODO
	
	public void viagemInter()
	{
		this.nIn = true;
	}
	
	public void viagemNacional()
	{
		this.nIn = false;
	}
	
	public void tipo()
	{
		System.out.println("Modelo: "+this.modelo+"\nCapacidade do tanque: "+this.capacidadeTanque+"\nAssentos maximos: "+this.assentosMax+
				"\nVelocidade Maxima: "+this.velocidadeMax+"\nAltura maxima: "+this.altMax+" metros"+"\nA viagem é internacional? "+this.nIn);
	}
	
	
	
	
}
