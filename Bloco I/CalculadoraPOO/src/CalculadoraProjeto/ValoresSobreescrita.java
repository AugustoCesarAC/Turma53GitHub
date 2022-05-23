package CalculadoraProjeto;

import java.util.InputMismatchException;

public class ValoresSobreescrita extends Valores
{

	public double soma()
	{
		try {
			this.v1 = input.nextDouble();
			this.v2 = input.nextDouble();
			df.format(calc = (this.v1 + this.v2));
			}catch(InputMismatchException erro) {
				System.out.println("Tipo de dado incompatível "+erro);
			}
		this.listHist.add(calc);
		return calc;
	}
	public double soma(double v1, double v2)
	{
		try {
			df.format(calc = (this.v1 + this.v2));
			}catch(InputMismatchException erro) {
				System.out.println("Tipo de dado incompatível "+erro);
			}
		this.listHist.add(calc);
		return calc;
	}
	
}
