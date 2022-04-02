package me.dio.internationalCarrerAcceleration_2.tonnie;

import java.io.IOException;
import java.util.Scanner;

/**
 * John and Mary have been friends since nursery school. Since then, they have
 * shared a playful routine: every time they meet, they play Head or Tail with a
 * coin, and whoever wins has the priviledge of deciding what they are going to
 * play during the day. Mary always choose Head, and John always choose Tail.
 * 
 * Nowadays they are in college, but continue being truly good friends. Whenever
 * they meet, they still play Head and Tail, and the winner decides which film
 * to watch, or which restaurant to have dinner together, and so on.
 * 
 * Yesterday Mary confided to John that she has being keeping a record of the
 * results of every play since they started, in nursery school. It came as a
 * surprise to John! But since John is studying Computer Science, he decided it
 * was a good opportunity to show Mary his skills in programming, by writing a
 * program to determine the number of times each of them won the game over the
 * years.
 * 
 * Input The input contains several test cases. The first line of a test case
 * contains a single integer N indicating the number of games played (1 <= N <=
 * 10000). The following line contains N integers Ri, separated by space,
 * describing the list of results. If Ri = 0 it means Mary won the ith game, if
 * Ri = 1 it means John won the ith game (1 <= i <= N). The end of input is
 * indicated by N = 0.
 * 
 * Output For each test case in the input your program should output a line
 * containing the sentence "Mary won X times and John won Y times", where 0 <= X
 * and 0 <= Y.
 * 
 * 
 * John e Mary são amigos desde a creche. Desde então, eles compartilham uma
 * rotina lúdica: cada vez que se encontram, jogam Cabeça ou Cauda com uma
 * moeda, e quem ganha tem o privilégio de decidir o que vai jogar durante o
 * dia. Mary sempre escolhe a cabeça e John sempre escolhe a cauda.
 * 
 * Hoje eles estão na faculdade, mas continuam sendo bons amigos. Sempre que se
 * encontram, eles ainda jogam Head and Tail, e o vencedor decide qual filme
 * assistir, ou qual restaurante jantar juntos, e assim por diante.
 * 
 * Ontem Mary confidenciou a John que tem mantido um registro dos resultados de
 * todas as peças desde que começaram, na creche. Foi uma surpresa para John!
 * Mas, como John está estudando Ciência da Computação, ele decidiu que era uma
 * boa oportunidade para mostrar a Mary suas habilidades em programação,
 * escrevendo um programa para determinar o número de vezes que cada um deles
 * venceu o jogo ao longo dos anos.
 * 
 * Entrada <br>
 * A entrada contém vários casos de teste. A primeira linha de um caso de teste
 * contém um único inteiro N indicando o número de jogos disputados (1 <= N <=
 * 10000). A linha a seguir contém N inteiros Ri, separados por espaço, que
 * descrevem a lista de resultados. Se Ri = 0 significa que Mary venceu o iº
 * jogo, se Ri = 1 significa que John venceu o iº jogo (1 <= i <= N). O fim da
 * entrada é indicado por N = 0.
 * 
 * Saída<br>
 * Para cada caso de teste na entrada, seu programa deve imprimir uma linha
 * contendo a frase "Maria ganhou X vezes e João ganhou Y vezes", onde 0 <= X e
 * 0 <= Y.
 * 
 * @author phsg5
 *
 */
public class Desafio2_A {

	public static void main(String[] args) throws IOException {
		Scanner vInput = new Scanner(System.in);

		int vWonMary = 0;
		int vWonJohn = 0;
		int vTotalGame = vInput.nextInt();
		vInput.nextLine();

		String vMatchResult = vInput.nextLine();
		String[] vArrayMatchResult = vMatchResult.split(" ");

		for (int vMatch = 0; vMatch < vTotalGame; vMatch++) {
			int vResult = Integer.parseInt(vArrayMatchResult[vMatch]);
			if (vResult == 0) {
				vWonMary++;
			} else if (vResult == 1) {
				vWonJohn++;
			}
		}
		System.out.println("Mary won " + vWonMary + " times and John won " + vWonJohn + " times");

		vInput.close();
	}

}