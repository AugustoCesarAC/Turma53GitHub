programa
{
	
	funcao inicio()
	{
		real poluicao

		escreva("Digite o valor de poluição: ")
		leia(poluicao)

		se(poluicao >= 0.5)
		{
			escreva("Todos os grupos devem ser notificados e paralisarem as atividades\n")	
		}
		senao se(poluicao >= 0.4)
		{
			escreva("Os grupos 1° e 2° devem ser notificados e suspederem as atividades\n")	
		}
		senao se(poluicao >= 0.3)
		{
			escreva("Os grupos 1° devem ser notificados e suspederem as atividades\n")	
		}
		senao
		{
			escreva("Poluição dentro da medida\n")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */