programa
{
	inclua biblioteca Util --> util
	
	
	funcao inicio()
	{
		inteiro vetorDado[10], dado, media = 0, maiorDado = 0, valorMaiorOcorrido = 0

		escreva("Os números do dado lançado são:")
		
		para(inteiro posicao = 0; posicao <= 9; posicao ++)
		{
			dado = util.sorteia(1, 6)
			vetorDado[posicao] = dado
			media += vetorDado[posicao]
			escreva(" ", vetorDado[posicao])
			
			se(maiorDado <= vetorDado[posicao])
			{
				maiorDado = vetorDado[posicao]
			}
		}

		para(inteiro posicao = 0; posicao <= 9; posicao ++)
		{
			se(vetorDado[posicao] == maiorDado)
			{
				valorMaiorOcorrido += 1
			}
		}
		
		escreva("\nA média dos valores do dado é: ", media/10, "\nO maior valor é: ", maiorDado, "\nO maior valor ocorreu um total de: ", valorMaiorOcorrido)	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetorDado, 8, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */