package me.dio.primeiroPassoEmJava;

import java.io.IOException;
import java.util.Scanner;

/**
 * Norminia � uma professora e pesquisadora renomada de uma famosa Universidade
 * do Brasil, com in�meras pr�mia��es e reconhecimento internacional pelo seu
 * trabalho. Recentemente, Norminia foi convidada para ministrar aulas em uma
 * Universidade da Alemanh�. Mesmo falando muito bem a L�ngua alem�, Norminia
 * ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a
 * proposta e encar�-la como um bom desafio.
 * 
 * Os estudantes adoraram a metodologia de ensino de Norminia e tudo estava indo
 * super bem, at� o momento da aplica��o da sua primeira prova. Acostumada a dar
 * notas de 0 (zero) a 100 (cem), ela fez o mesmo na primeira prova da sua turma
 * da Alemanh�. No entanto, os estudante acharam estranho, uma vez que na
 * Alemanh� o sistema de notas � diferente: as notas devem ser dadas como
 * conceitos de A a E. O conceito A � o mais alto, enquanto o conceito E � o
 * mais baixo.
 * 
 * Conversando com outros docentes, ela recebeu a sugest�o de utilizar a
 * seguinte tabela, relacionando as notas num�ricas com as notas de conceitos:
 * 
 * 
 * 
 * O problema � que Norminia j� deu as notas no sistema num�rico, e ter� que
 * converter as notas para o sistema de letras. No entanto, Norminia precisa
 * preparar as pr�ximas atividades educacionais para os seus alunos, e n�o tem
 * tempo suficiente para fazer a convers�o das notas manualmente.
 * 
 * Voc� ter� o seguinte desafio: escrever um programa que recebe uma nota no
 * sistema num�rico e determina o conceito correspondente.
 * 
 * Entrada A entrada cont�m um �nico conjunto de testes, que deve ser lido do
 * dispositivo de entrada padr�o (normalmente o teclado). A entrada cont�m uma
 * �nica linha com um n�mero inteiro N (0 <= N <= 100), representando uma nota
 * de prova no sistema num�rico.
 * 
 * Sa�da Seu programa deve imprimir, na sa�da padr�o, uma letra (A, B, C, D, ou
 * E em mai�sculas) representando o conceito correspondente � nota dada na
 * entrada.
 * 
 * 
 * Exemplos de Entrada Exemplos de Sa�da 12
 * 
 * D
 * 
 * 
 * 87
 * 
 * A
 * 
 * 
 * 0
 * 
 * E
 * 
 * @author phsg5
 *
 */
public class Desafio4_NotaProva {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int nota = input.nextInt();

		if (nota < 1) {
			System.out.println('E');
		} else if (nota < 36) {
			System.out.println('D');
		} else if (nota < 61) {
			System.out.println('C');
		} else if (nota < 86) {
			System.out.println('B');
		} else
		// if ( )
		{
			System.out.println('A');
		}
		input.close();
	}
}
