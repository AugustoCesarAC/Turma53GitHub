package Collections;

import java.util.ArrayList;

public class TesteAula
{

	public static void main(String[] args)
	{
		Aula a1 = new Aula(" Laço de Repeticao", 50);
		Aula a2 = new Aula(" Matrizes", 45);
		Aula a3 = new Aula(" POO", 120);
		
		
		ArrayList<Aula> taula =new ArrayList<>();
		
		taula.add(a1);
		taula.add(a2);
		taula.add(a3);
		
		//gen.remove(1);
		
		System.out.println(taula.size());
		
		System.out.println(taula.get(2));
		System.out.println("");
		System.out.println(taula);

	}

}
