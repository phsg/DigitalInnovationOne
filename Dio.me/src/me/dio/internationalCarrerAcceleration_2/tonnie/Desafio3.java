package me.dio.internationalCarrerAcceleration_2.tonnie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Alice and Betty collect Pok´mon cards. The cards are printed for a game that
 * imitates the battle system of one of the most popular videogames in history,
 * but Alice and Betty are too young to actually play the game, and are only
 * interested in the actual cards. To make it easier, we'll assume each card has
 * a unique identifier, given as an integer number.
 * 
 * Both girls have a set of cards, and, like most girls their age, like to trade
 * the cards they have. They obviously don't care about identical cards they
 * both have, and they don't want to receive repeated cards in the trade.
 * Besides, the cards are traded in a single operation: Alice gives Betty N
 * distinct cards and receives back other N distinct cards.
 * 
 * The girls want to know what is the maximum number of cards they can trade.
 * For instance, if Alice has cards {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} and Betty
 * has cards {2, 2, 2, 3, 4, 6, 10, 11, 11}, they can trade at most four cards.
 * 
 * Write a program that given the sets of cards owned by Alice and Betty,
 * determines the maximum number of cards they can trade.
 * 
 * Input The input contains several test cases. The first line of a test case
 * contains two integers A and B, separated by a blank space, indicating
 * respectively the number of cards Alice and Betty have (1 <= A <= 104 and 1 <=
 * B <= 104). The second line contains A space-separated integers Xi, each
 * indicating one of Alice\'s cards(1 <= Xi <= 105). The third line contains B
 * integers Yi separated by whitespaces, each number indicating one of Betty's
 * cards(1 <= Yi <= 105). Alice and Betty's cards are listed in non-descending
 * order.
 * 
 * The end of input is indicated by a line containing only two zeros, separated
 * by a blank space.
 * 
 * Output For each test case, your program should print a single line,
 * containing an integer number, indicating the maximum number of cards Alice
 * and Betty can trade.
 * 
 * 
 * Alice e Betty colecionam cartas de Pokémon. As cartas são impressas para um
 * jogo que imita o sistema de batalha de um dos videogames mais populares da
 * história, mas Alice e Betty são muito novas para realmente jogar o jogo e só
 * estão interessadas nas cartas reais. Para facilitar, assumiremos que cada
 * cartão possui um identificador único, fornecido como um número inteiro.
 * 
 * Ambas as meninas têm um conjunto de cartas e, como a maioria das garotas de
 * sua idade, gostam de trocar as cartas que possuem. Eles obviamente não se
 * importam com as cartas idênticas que ambos possuem e não querem receber
 * cartas repetidas na troca. Além disso, as cartas são negociadas em uma única
 * operação: Alice dá a Betty N cartas distintas e recebe de volta outras N
 * cartas distintas.
 * 
 * As meninas querem saber qual é o número máximo de cartas que podem trocar.
 * Por exemplo, se Alice tiver cartas {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} e Betty
 * tiver cartas {2, 2, 2, 3, 4, 6, 10, 11, 11 }, eles podem negociar no máximo
 * quatro cartas.
 * 
 * Escreva um programa que, dados os conjuntos de cartas de Alice e Betty,
 * determine o número máximo de cartas que eles podem negociar.
 * 
 * Entrada<br>
 * A entrada contém vários casos de teste. A primeira linha de um caso de teste
 * contém dois inteiros A e B, separados por um espaço em branco, indicando
 * respectivamente o número de cartas que Alice e Betty possuem (1 <= A <= 104 e
 * 1 <= B <= 104). A segunda linha contém A inteiros separados por espaço Xi,
 * cada um indicando um dos cartões de Alice (1 <= Xi <= 105). A terceira linha
 * contém B inteiros Yi separados por espaços em branco, cada número indicando
 * uma das cartas de Betty (1 <= Yi <= 105). As cartas de Alice e Betty são
 * listadas em ordem não decrescente.
 * 
 * O final da entrada é indicado por uma linha contendo apenas dois zeros,
 * separados por um espaço em branco.
 * 
 * Saída<br>
 * Para cada caso de teste, seu programa deve imprimir uma única linha, contendo
 * um número inteiro, indicando o número máximo de cartas que Alice e Betty
 * podem negociar.
 *
 *
 * Sample Input | Sample Output<br>
 * 1 1 | 0<br>
 * 1000<br>
 * 1000<br>
 * 3 4 | 3<br>
 * 1 3 5<br>
 * 2 4 6 8<br>
 * 10 9 | 4 <br>
 * 1 1 2 3 5 7 8 8 9 15<br>
 * 2 2 2 3 4 6 10 11 11<br>
 * 0 0
 * 
 * 0 3 4
 * 
 * @author phsg5
 *
 */
public class Desafio3 {

	private static int diffent(String[] pArrayPlay_1, String[] pArrayPlay_2) {
		int vResult = 0;
		int vLast_y = 0;
		int vLastTrade = 0;
		for (int x = 0; x < pArrayPlay_1.length;) {
			int vCard_1 = Integer.parseInt(pArrayPlay_1[x]);
			if (vLast_y == pArrayPlay_2.length) {
				vResult++;
				x++;
			} else {
				for (int y = vLast_y; y < pArrayPlay_2.length;) {
					int vCard_2 = Integer.parseInt(pArrayPlay_2[y]);
					if (vCard_1 < vCard_2) {
						if (vCard_1 != vLastTrade) {
							vResult++;
							vLastTrade = vCard_1;
						}
						x++;
						break;
					}
					if (vCard_1 == vCard_2) {
						x++;
						break;
					}
					if (vCard_1 > vCard_2) {
						vLast_y = ++y;
					}
				}
			}
		}
		return vResult;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader vInput = new InputStreamReader(System.in);
		BufferedReader vBuffer = new BufferedReader(vInput);
		String[] vNumberCard;
		int vNumberCard_A;
		int vNumberCard_B;
		int vTest_1;
		int vTest_2;
		List<Integer> vListResult = new ArrayList<Integer>();
		do {
			vNumberCard = vBuffer.readLine().split(" ");
			vNumberCard_A = Integer.parseInt(vNumberCard[0]);
			vNumberCard_B = Integer.parseInt(vNumberCard[1]);
			if (vNumberCard_A != 0 && vNumberCard_B != 0) {
				String[] vArrayPlay_1 = vBuffer.readLine().split(" ");
				String[] vArrayPlay_2 = vBuffer.readLine().split(" ");
				vTest_1 = diffent(vArrayPlay_1, vArrayPlay_2);
				vTest_2 = diffent(vArrayPlay_2, vArrayPlay_1);
				if (vTest_1 < vTest_2) {
					vListResult.add(vTest_1);
				} else {
					vListResult.add(vTest_2);
				}
			}

		} while (vNumberCard_A != 0 && vNumberCard_B != 0);

		for (int vPrint : vListResult) {
			System.out.println(vPrint);
		}
	}

}