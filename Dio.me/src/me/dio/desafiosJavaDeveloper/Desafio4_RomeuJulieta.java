package me.dio.desafiosJavaDeveloper;

import java.util.Scanner;

/**
 * Desafio Romeu e Julieta acabaram de casar e est�o planejamendo a Lua de Mel
 * na Europa. Como v�o visitar v�rios pa�ses, o fuso hor�rio de cada um �
 * diferente, por isso eles precisam ficar atento �s escalas.
 * 
 * Para que a Lua de Mel deles seja um sucesso, ele pediram que voc� desenvolva
 * um aplicativo que, a partir da hora de sa�da, tempo de viagem e fuso hor�rio
 * do destino comparado ao pa�s de origem, informe a hora de chegada de cada v�o
 * no destino.
 * 
 * Por exemplo, se eles partirem �s 10 horas da manh� para uma viagem de 4 horas
 * rumo a um destino que fica � leste, em um fuso hor�rio com uma hora a mais
 * com rela��o ao fuso hor�rio do ponto de partida, a hora de chegada ter� que
 * ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou
 * seja, chegar�o �s 15 horas. Note que se a hora calculada for igual a 24, seu
 * programa dever� imprimir 0 (zero).
 * 
 * Entrada A entrada cont�m 3 inteiros: S (0 <= S <= 23), T (1 <= T <= 12) e F
 * (-5 <= F <= 5), separados por um espa�o, indicando respectivamente a hora da
 * sa�da, o tempo de viagem e o fuso hor�rio do destino com rela��o � origem.
 * 
 * Sa�da Imprima um inteiro que indica a hora local prevista no destino,
 * conforme os exemplos abaixo.
 * 
 * @author phsg5
 *
 */
public class Desafio4_RomeuJulieta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();

		int vResultado = horasaida + tempoviagem + fuso;
		if (vResultado > 24) {
			vResultado = vResultado - 24;
		}

		System.out.println(vResultado);

		sc.close();
	}

}