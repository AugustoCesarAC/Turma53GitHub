programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		real matrizSoma[3][3], soma = 0.0, somaDiagonal = 0.0

		para(inteiro linha = 0; linha < 3; linha++)
		{			
			para(inteiro coluna = 0; coluna < 3; coluna ++)
			{	
				escreva("Digite os valores da matriz 3X3: ")
				leia(matrizSoma[linha][coluna])//matrizSoma[linha][coluna] = util.sorteia(1,9)
				soma += matrizSoma[linha][coluna]
			}
		}

		para(inteiro linha =0; linha < 3; linha++)
		{
			somaDiagonal += matrizSoma[linha][linha]
		}
		escreva("\nA soma dos valores é: ",soma, "\nA soma da Diagonal Principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizSoma, 7, 7, 10}-{soma, 7, 25, 4}-{somaDiagonal, 7, 37, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */