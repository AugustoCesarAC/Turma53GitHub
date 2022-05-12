package ProjetoPOO;

import java.util.Random;

public class BattleRPG
{

	Random rand = new Random();
	StatusRPG stats = new StatusRPG();
	PlayerNpcRPG player = new PlayerNpcRPG();
	
	//ATRIBUTOS
	int d20;
	int hp;
	double atk; // ATK = FOR - D20
	double def; // DEF = HP - FOR%
	int dano; // DANO = ATK - DEF INIMIGO%
	
	//METODO CONSTRUTOR
	public BattleRPG(int x)// X é o valor do ataque principal do personagem
	{	
		this.hp = stats.vigor*5;
		this.atk = x + (this.d20*0.25);
		this.def = (stats.vigor+(x*0.25));//REDUÇÃO EM PORCENTAGEM
	}
	
	//METODO
	public void battlePhase()
	{
		this.d20 = rand.nextInt(1,21);
		this.atk = this.atk-(this.atk*(this.def/100));
		if(this.d20 == 20)
			this.atk = this.atk + stats.sor*2;
		this.hp -= this.atk;
	}
	
	
}
