package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Ler um número inteiro N e calcular todos os seus divisores.
 * 
 * Entrada O arquivo de entrada contém um valor inteiro.
 * 
 * Saída Escreva todos os divisores positivos de N, um valor por linha.
 * 
 * 
 * Exemplo de Entrada Exemplo de Saída 6
 * 
 * 1 2 3 6
 * 
 * Agradecimentos a Cassio F.
 * 
 * @author phsg5
 *
 */
public class Desafio3_Divisores {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int x = 1; x <= (N / 2); x++) {
			if ((N % x) == 0) {
				System.out.println(x);
			}
		}
		System.out.println(N);
		leitor.close();
	}
}
