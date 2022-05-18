package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo1
{

	public static void main(String[] args)
	{
		String aula1 = "Bloco I";
		String aula2 = "Bloco II";
		String aula3 = "Bloco III";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		System.out.println(aulas);
		
		aulas.add("Feira de Empregabilidade");
		aulas.add(aula2);
		aulas.add(aula1);
		aulas.add(aula3);

		System.out.println("Mostra o tamanho da lista");
		System.out.println(aulas.size());
		
		System.out.println(aulas);
		
		//Ordenar a lista (ArrayList)
		Collections.sort(aulas);
			
		System.out.println(aulas);
		
		String x = aulas.get(1);
		
		System.out.println(x);
		
		System.out.println(aulas.get(3));
		
		
		System.out.println(aulas.contains("Bloco I"));
		
		//apagar da lista
		aulas.remove(2);
		
		System.out.println(aulas);
		
		aulas.clear();
		
		System.out.println(aulas);

	}

}
