package me.dio.desafiosJavaDeveloper;

import java.io.IOException;
import java.util.Scanner;

/**
 * No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo)
 * � sempre branca e as cores das casas se alternam entre branca e preta,
 * formando o formato t�o conhecido como xadrez. Dessa forma, como o tabuleiro
 * tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8
 * (canto inferior direito) ser� tamb�m branca. Por�m, neste problema, queremos
 * ser capazes de predizer a cor independente do n�mero de linhas e colunas,
 * sendo: L linhas e C colunas. No exemplo da figura, para L = 6 e C = 9, a casa
 * no canto inferior direito ser� preta, uma simples previs�o matem�tica, n�o?
 * 
 * 
 * 
 * Entrada A primeira linha da entrada cont�m um inteiro L (1 <= L <= 1000)
 * indicando o n�mero de linhas do tabuleiro. A segunda linha da entrada cont�m
 * um inteiro C (1 <= C <= 1000) representando o n�mero de colunas.
 * 
 * Sa�da Imprima uma linha na sa�da. A linha deve conter um inteiro,
 * representando a cor da casa no canto inferior direito do tabuleiro, e para
 * identificar, considere o inteiro 1 para a cor branca e 0 para a cor preta.
 * 
 * @author phsg5
 *
 */
public class Desafio1_Xadrez {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int C = sc.nextInt();
		if (((L + C) % 2) == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close();
	}

}