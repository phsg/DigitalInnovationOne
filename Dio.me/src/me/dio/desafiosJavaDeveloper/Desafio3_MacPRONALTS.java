package me.dio.desafiosJavaDeveloper;

import java.util.Locale;
import java.util.Scanner;

/**
 * O MacPRONALTS está com uma super promoção, exclusivo para os competidores da
 * primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os
 * maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila
 * muito grande. O pior é que a moça do caixa estava sem calculadora ou um
 * programa para ajudá-la a calcular com maior agilidade, eis que surge você
 * para fazer um programa para ajudar a coitada e aumentar a renda do
 * MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu
 * respectivo valor.
 * 
 * 1001 | R$ 1.50
 * 
 * 1002 | R$ 2.50
 * 
 * 1003 | R$ 3.50
 * 
 * 1004 | R$ 4.50
 * 
 * 1005 | R$ 5.50
 * 
 * Entrada A primeira entrada informada é a quantidade de produtos comprados (1
 * <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o
 * consumidor comprou.
 * 
 * Obs.: não poderão ser informados números de produtos repetidos.
 * 
 * Saída Você deve imprimir o valor da compra com duas casas decimais.
 * 
 * @author phsg5
 *
 */
public class Desafio3_MacPRONALTS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int vProduto = 0, vQuantidade = 0;
		double vResposta = 0, vValor = 0;
		int N = Integer.parseInt(sc.nextLine());

		for (int x = 0; x < N; x++) {
			vProduto = sc.nextInt();
			vQuantidade = sc.nextInt();

			if (vProduto == 1001) {
				vValor = 1.50;
			} else if (vProduto == 1002) {
				vValor = 2.5;
			} else if (vProduto == 1003) {
				vValor = 3.5;
			} else if (vProduto == 1004) {
				vValor = 4.5;
			} else if (vProduto == 1005) {
				vValor = 5.5;
			}

			vResposta += vValor * vQuantidade;
		}
		System.out.printf("%.2f\n", vResposta);
		sc.close();
	}

}