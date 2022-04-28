programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, y1
		real x2, y2
		real distancia
		escreva("Digite o Ponto x1: ")
		leia(x1)
		escreva("Digite o Ponto y1: ")
		leia(y1)
		escreva("Digite o Ponto x2: ")
		leia(x2)
		escreva("Digite o Ponto y2: ")
		leia(y2)
		distancia = (mat.potencia(x2-x1,2) + (mat.potencia(y2-y1,2)
		distancia = mat.raiz(distancia, 2)
		escreva("\nA distância entre os pontos é: "distancia,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */