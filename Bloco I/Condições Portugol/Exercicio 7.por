programa
{
	
	funcao inicio()
	{
		real b, a, resultado

		escreva("Digite valor da base do triangulo: ")
		leia(b)
		escreva("Digite valor da altura do triangulo: ")
		leia(a)

		se(a<0 ou b<0)
		{
			escreva("\nUm dos valores foi negativo, logo, impossivel calcular\n")
		}
		senao
		{
			resultado = (b*a)/2
			escreva("\nA area do triangulo é: ",resultado,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */