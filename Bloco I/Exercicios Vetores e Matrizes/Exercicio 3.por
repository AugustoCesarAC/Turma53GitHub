programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		inteiro matrizN1[4][6], matrizN2[4][6]
		inteiro matrizM1[4][6], matrizM2[4][6]

		escreva("A soma dos valores da matriz são: \n")
		
		para(inteiro linha = 0; linha < 4; linha++)
		{
			para(inteiro coluna = 0; coluna < 6; coluna++)
			{
				matrizN1[linha][coluna] = util.sorteia(1,9)//leia(matrizN1[linha][coluna])
				matrizN2[linha][coluna] = util.sorteia(1,9)//leia(matrizN2[linha][coluna])
				matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna]
				matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna]
				escreva("[",matrizM1[linha][coluna],"]")
			}
			escreva("\n")
		}
		escreva("\nA diferença dos valores da matriz são: \n")
		para(inteiro linha = 0; linha < 4; linha++)
		{
			para(inteiro coluna = 0; coluna < 6; coluna++)
			{
				escreva("[",matrizM2[linha][coluna],"]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizN1, 7, 10, 8}-{matrizN2, 7, 26, 8}-{matrizM1, 8, 10, 8}-{matrizM2, 8, 26, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */