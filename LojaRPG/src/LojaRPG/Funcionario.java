package LojaRPG;

public class Funcionario extends Pessoa
{
	
	public double salario;//GANHA PÃO
	public boolean chave = false;//ACESSAR A LOJA
	
	public void alterarSalario()
	{
		
	}
	
	public void entrarLoja()
	{
		this.chave = true;
	}
	
}
