programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a, b, c, calculoR, calculoS, calculoD
		escreva("Digite um numero inteiro e positivo para 'A': ")
		leia(a)
		escreva("Digite um numero inteiro e positivo para 'B': ")
		leia(b)
		escreva("Digite um numero inteiro e positivo para 'C': ")
		leia(c)
		calculoR = mat.potencia(a+b,2)
		calculoS = mat.potencia(b+c,2)
		calculoD = (calculoR + calculoS)/2
		escreva("O resultado da formula 'D' é: ", calculoD, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */