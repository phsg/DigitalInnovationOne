package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Ramsay: "(...) voc� vence se conseguir adivinhar quem eu sou e por que estou
 * torturando voc�."
 * 
 * Theon deve pensar r�pido e adivinhar quem � seu algoz! Entretanto, Ramsay j�
 * decidiu o que ele ir� fazer depois que Theon der sua resposta.
 * 
 * Theon pode dizer que seu algoz � alguma dentre N pessoas. Considere que as
 * pessoas s�o numeradas de 1 a N. Se Theon responder que seu algoz � a pessoa
 * i, Ramsay ir� atingi-lo Ti vezes.
 * 
 * Sua tarefa � ajudar Theon a determinar qual deve ser sua resposta de forma a
 * minimizar o n�mero de vezes que ele ser� atingido.
 * 
 * Entrada A primeira linha cont�m um inteiro N (1 <= N <= 100). A segunda linha
 * cont�m N inteiros T1, T2, ..., TN (0 <= Ti <= 20).
 * 
 * Sa�da Imprima uma linha contendo o n�mero da pessoa que Theon deve dizer ser
 * seu algoz. Se existe mais de uma resposta poss�vel, imprima a menor.
 * 
 * 
 * Exemplos de Entrada Exemplos de Sa�da 3 <br>
 * 8 0 7
 * 
 * 2
 * 
 * 
 * 2 <br>
 * 1 1
 * 
 * 1
 * 
 * Escola de Inverno da Maratona - Erechim RS - 2015
 * 
 * @author phsg5
 *
 */
public class Desafio2_ResposataAlgoz {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int x = 0; x < N; x++) {
			T = leitor.nextInt();
			if (x == 0) {
				posMenor = 1;
				menor = T;
			} else if (T < menor) {
				posMenor = x + 1;
				menor = T;
			}
		}
		System.out.println(posMenor);
		leitor.close();
	}
}
