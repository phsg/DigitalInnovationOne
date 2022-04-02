package me.dio.internationalCarrerAcceleration_2.tonnie;

import java.io.IOException;
import java.util.Scanner;

/**
 * Challenge A supermarket is doing a sales promotion for soft drinks. If one
 * day you buy soft drinks and bring the empty bottles the next day, they
 * exchange each set of K empty bottles for a full one. A customer wants to make
 * the most of this offer and therefore bought several bottles on the first day
 * of the promotion. Now he wants to know how many bottles he will have at the
 * end of the second day of the promotion if he use it to the fullest.
 * 
 * Make a program to calculate this.
 * 
 * Input The first input line contains integer T (1 <= T <= 10000), which
 * indicates the number of test cases. In each of the following T lines come two
 * integers N and K (1 <= K, N <= 10000), respectively the number of soft drinks
 * bought and the number of empty bottles to gain a full.
 * 
 * Output For each test case print the number of bottles that the customer will
 * have on the second day, if he makes the most of the offer.
 * 
 * 
 * Desafio Um supermercado está fazendo uma promoção de vendas de refrigerantes.
 * Se um dia você compra refrigerante e traz as garrafas vazias no dia seguinte,
 * eles trocam cada conjunto de K garrafas vazias por uma cheia. Um cliente quer
 * aproveitar ao máximo esta oferta e, por isso, comprou várias garrafas no
 * primeiro dia da promoção. Agora ele quer saber quantas garrafas terá ao final
 * do segundo dia de promoção se aproveitar ao máximo.
 * 
 * Faça um programa para calcular isso.
 * 
 * Entrada A primeira linha de entrada contém o inteiro T (1 <= T <= 10000), que
 * indica o número de casos de teste. Em cada uma das seguintes T linhas vêm
 * dois inteiros N e K (1 <= K, N <= 10000), respectivamente o número de
 * refrigerantes comprados e o número de garrafas vazias para ganhar um cheio.
 * Saída Para cada caso de teste imprima a quantidade de garrafas que o cliente
 * terá no segundo dia, se ele aproveitar ao máximo a oferta.
 * 
 * @author phsg5
 *
 */
public class Desafio01 {

	public static void main(String[] args) throws IOException {

		Scanner vInput = new Scanner(System.in);

		int vTotalTestCases = vInput.nextInt();
		vInput.nextLine();
		int[] vReturn = new int[vTotalTestCases];

		for (int x = 0; x < vTotalTestCases; x++) {
			String[] vCase = vInput.nextLine().split(" ");

			int vDrink = Integer.parseInt(vCase[0]);
			int vBottle = Integer.parseInt(vCase[1]);
			int vDivision;
			int vRest;
			if (vDrink > vBottle) {
				vDivision = vDrink / vBottle;
				vRest = vDrink % vBottle;
				vReturn[x] = vRest + vDivision;
			} else if (vDrink < vBottle) {
				vDivision = vBottle % vDrink;
				vReturn[x] = 1 + vDivision;
			} else {
				vReturn[x] = 1;
			}
		}
		vInput.close();

		for (int vPrint : vReturn) {
			System.out.println(vPrint);
		}

	}

}