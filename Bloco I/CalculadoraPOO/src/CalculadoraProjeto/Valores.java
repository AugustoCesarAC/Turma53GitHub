package CalculadoraProjeto;

import java.awt.event.FocusEvent.Cause;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Valores implements Calculadora
{

	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	
	protected double calc;
	protected double v1;
	protected double v2;
	protected List<Double> listHist = new ArrayList<Double>();
	
	public double getCalc()
	{
		return calc;
	}

	public List<Double> getListHist()
	{
		return listHist;
	}

	@Override
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

	@Override
	public double subtracao()
	{
		try {
			this.v1 = input.nextDouble();
			this.v2 = input.nextDouble();
			df.format(calc = (this.v1 - this.v2));
			}catch(InputMismatchException erro) {
				System.out.println("Tipo de dado incompatível "+erro);
			}
		this.listHist.add(calc);
		return calc;
		
	}

	@Override
	public double divisao()
	{
		try {
		this.v1 = input.nextDouble();
		this.v2 = input.nextDouble();
		
		df.format(calc = (this.v1 / this.v2));
		}catch(InputMismatchException erro) {
			System.out.println("Tipo de dado incompatível "+erro);
		}
		this.listHist.add(calc);
		
		return calc;
	}

	@Override
	public double mult()
	{
		try {
		this.v1 = input.nextDouble();
		this.v2 = input.nextDouble();
		df.format(calc = (this.v1 * this.v2));
		}catch(InputMismatchException erro) {
			System.out.println("Tipo de dado incompatível "+erro);
		}
		this.listHist.add(calc);
		return calc;
		
	}

	@Override
	public List<Double> hist()
	{
		return listHist;
		
	}

}
