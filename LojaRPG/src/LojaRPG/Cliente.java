package LojaRPG;

import java.util.Random;

public class Cliente extends Pessoa
{

	Random rand = new Random();
	
	public int CRF;//CPF DE RAÇA
	public double carteira;//SALDO DINHEIRO
	
	public void geradorCRF()
	{
		this.CRF = rand.nextInt(100000,999999);
	}
	
}
