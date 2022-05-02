programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		para(inteiro contador = 1; contador <= 500; contador ++)
		{			
			se (contador%3 == 0 e contador%2 != 0)
			{
					soma += contador
			}			
		}
		escreva("A soma do números diviseis por 3 e ímpares é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {soma, 6, 10, 4}-{contador, 7, 15, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */