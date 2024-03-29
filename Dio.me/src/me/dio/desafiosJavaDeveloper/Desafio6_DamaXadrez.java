package me.dio.desafiosJavaDeveloper;

import java.util.Scanner;

/**
 * O jogo de xadrez possui v�rias pe�as com movimentos curiosos: uma delas � a
 * dama, que pode se mover qualquer quantidade de casas na mesma linha, na mesma
 * coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo: O
 * grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de
 * xadrez: dada a posi��o de uma dama em um tabuleiro de xadrez vazio (ou seja,
 * um tabuleiro 8 � 8, com 64 casas), de quantos movimentos, no m�nimo, ela
 * precisa para chegar em outra casa do tabuleiro?
 * 
 * Kary achou a solu��o para alguns desses problemas, mas teve dificuldade com
 * outros, e por isso pediu que voc� escrevesse um programa que resolve esse
 * tipo de problema.
 * 
 * Entrada A entrada cont�m v�rios casos de teste. A primeira e �nica linha de
 * cada caso de teste cont�m quatro inteiros X1, Y1, X2 e Y2 (1 <= X1, Y1, X2,
 * Y2 <= 8). A dama come�a na casa de coordenadas (X1, Y1), e a casa de destino
 * � a casa de coordenadas(X2, Y2). No tabuleiro, as colunas s�o numeradas da
 * esquerda para a direita de 1 a 8 e as linhas de cima para baixo tamb�m de 1 a
 * 8. As coordenadas de uma casa na linha X e coluna Y s�o (X, Y ).
 * 
 * O final da entrada � indicado por uma linha contendo quatro zeros.
 * 
 * Sa�da Para cada caso de teste da entrada seu programa deve imprimir uma �nica
 * linha na sa�da, contendo um n�mero inteiro, indicando o menor n�mero de
 * movimentos necess�rios para a dama chegar em sua casa de destino.
 * 
 * @author phsg5
 *
 */
public class Desafio6_DamaXadrez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1, y1, x2, y2;
		// se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1
		// movimento
		// se estiver em qualquer outra posi��o, a rainha gastar� 2 movimentos!

		while (true) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			// condi��o de parada
			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
				break;
			}

			// Mesma casa
			if (x1 == x2 && y1 == y2) {
				System.out.println("0");
			} else
			// Mesma linha ou coluna
			if (x1 == x2 || y1 == y2) {
				System.out.println("1");
			} else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
				System.out.println();
			} else {
				System.out.println("2");
			}
		}
		sc.close();

	}

}