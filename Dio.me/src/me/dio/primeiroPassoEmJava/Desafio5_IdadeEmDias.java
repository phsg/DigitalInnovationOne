package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desafio Voc� ter� o desafio de ler um valor inteiro correspondente � idade de
 * uma pessoa em dias e informe-a em anos, meses e dias
 * 
 * Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo
 * m�s com 30 dias. Nos casos de teste nunca haver� uma situa��o que permite 12
 * meses e alguns dias, como 360, 363 ou 364.
 * 
 * Entrada O arquivo de entrada cont�m um valor inteiro.
 * 
 * Sa�da Imprima a sa�da conforme exemplo fornecido.
 * 
 * 
 * Exemplo de Entrada Exemplo de Sa�da 400
 * 
 * 1 ano(s) 1 mes(es) 5 dia(s)
 * 
 * 800
 * 
 * 2 ano(s) 2 mes(es) 10 dia(s)
 * 
 * 30
 * 
 * 0 ano(s) 1 mes(es) 0 dia(s)
 * 
 * @author phsg5
 *
 */
public class Desafio5_IdadeEmDias {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int idadeDias = leitor.nextInt();
		int anos = idadeDias / 365;
		idadeDias -= anos * 365;// implemente no espa�o em branco
		int meses = idadeDias / 30;
		idadeDias -= meses * 30; // implemente no espa�o em branco
		int dias = idadeDias;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		leitor.close();
	}
}
