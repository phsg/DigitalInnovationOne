package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desafios Crie um programa que leia um número e mostre os números pares até
 * esse número, inclusive ele mesmo.
 * 
 * Entrada Você receberá 1 valor inteiro N, onde N > 0.
 * 
 * Saída Exiba todos os números pares até o valor de entrada, sendo um em cada
 * linha.
 * 
 * 
 * Exemplo de Entrada Exemplo de Saída 6 2 4 6
 * 
 * @author phsg5
 *
 */
public class Desafio6_Pares {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int vNumero = leitor.nextInt();

		for (int x = 2; x <= vNumero; x = x + 2) {
			System.out.println(x);
		}

		leitor.close();
	}
}
