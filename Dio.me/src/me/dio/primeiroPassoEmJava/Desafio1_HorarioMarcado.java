package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Domingo � dia de feira. Logo de manh� muitas pessoas se deslocam para o polo
 * de lazer da Parangaba, onde acontece uma feira, conhecida por ser a maior da
 * cidade. Na feira da Parangaba voc� pode encontrar de tudo.
 * 
 * Todos os domingos, Bino faz compras na feira. Ele sempre marca com seu amigo
 * Cino de se encontrarem no terminal de �nibus da Parangaba �s 8h, para irem
 * juntos comprar na feira. Por�m, muitas vezes Bino acorda muito tarde e se
 * atrasa para o encontro com seu amigo.
 * 
 * Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o
 * atraso m�ximo de Bino.
 * 
 * Entrada A entrada consiste em m�ltiplos casos teste. Cada caso de tese cont�m
 * uma �nica linha contendo um hor�rio H (5:00 <= H <= 9:00) que Bino acordou. A
 * entrada termina com final de arquivo (EOF).
 * 
 * Sa�da Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X
 * indica o atraso maximo (em minutos) de Bino no encontro com Cino.
 * 
 * 
 * Exemplo de Entrada Exemplo de Sa�da 7:10 5:00
 * 
 * Atraso maximo: 10 Atraso maximo: 0
 * 
 * 
 * Olimp�ada Cearense de Inform�tica - 2015
 * 
 * @author phsg5
 *
 */
public class Desafio1_HorarioMarcado {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String[] relogio = leitor.nextLine().split(":");
			int hora = Integer.parseInt(relogio[0]);
			int min = Integer.parseInt(relogio[1]);
			switch (hora) {
			case (7):
				System.out.println("Atraso maximo: " + min);
				break;
			case (8):
				System.out.println("Atraso maximo: " + (60 + min));
				break;
			case (9):
				System.out.println("Atraso maximo: " + (60 + 60 + min));
				break;
			default:
				System.out.println("Atraso maximo: 0");
			}
		}
		leitor.close();
	}
}
