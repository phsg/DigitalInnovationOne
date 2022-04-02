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
public class Desafio2_GraoTabuleiroDama {

	private static long calculo(int pNumeroQuadraro) {
		long vResultado = 1;
		long vGramas = 0;
		long vQuilos = 0;

		for (int i = 1; i < pNumeroQuadraro; i++) {
			vResultado += 1 * (Math.pow(2, i));
			if (vResultado >= 12) {
				vGramas += vResultado / 12;
				vResultado = vResultado % 12;
			}
			if (vGramas >= 1000) {
				vQuilos += vGramas / 1000;
				vGramas = vGramas % 1000;
			}
		}
		// System.out.println("Resultado=" + vResultado + ",Gramas=" + vGramas + ",Kg="
		// + vQuilos); // aqui.
		return vQuilos;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int vNumeroQuadraro = sc.nextInt();
			System.out.println(calculo(vNumeroQuadraro) + " kg"); // Complete o c�digo aqui.
		}
		sc.close();
	}

//	private static long calculoLong(int pNumeroQuadraro) {
//	long vResultado = 1;
//	for (int i = 1; i < pNumeroQuadraro; i++) {
//		vResultado += 1 * (Math.pow(2, i));
//	}
//	long vGramas = vResultado / 12;
//	long vQuilos = vGramas / 1000;
//	//System.out.println("Resultado=" + vResultado + ",Gramas=" + vGramas + ",Kg=" + vQuilos); // aqui.
//	return vQuilos;
//}

}