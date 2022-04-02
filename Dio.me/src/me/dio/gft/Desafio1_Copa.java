package me.dio.gft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * O sorteio das posi��es dos jogadores na chave decisiva da copa do mundo de
 * ping-pong est� deixando a todos nervosos. � que ningu�m quer pegar o jogador
 * mais bem ranqueado, o Mestre Kung, logo nas oitavas de final, ou nas quartas
 * de final. Melhor que s� seja poss�vel enfrentar Mestre Kung na semifinal ou
 * na final!
 * 
 * A chave possui 16 posi��es numeradas de 1 a 16, como na figura abaixo. A
 * organiza��o da copa vai fazer um sorteio para definir em qual posi��o cada
 * jogador vai iniciar a chave decisiva. Nas oitavas de final, o jogador na
 * posi��o 1 enfrenta o jogador na posi��o 2; o da posi��o 3 enfrenta o da
 * posi��o 4; e assim por diante, como na figura.
 * 
 * 
 * 
 * 
 * 
 * O objetivo deste problema �, dadas as posi��es de Mestre Kung e Mestre Lu na
 * chave, decidir em que fase da competi��o Mestre Kung e Mestre Lu v�o se
 * enfrentar, caso ven�am todas as suas respectivas partidas antes de se
 * enfrentarem. Por exemplo, se o sorteio da chave determinar que Mestre Kung
 * ocupar� a posi��o 1 e Mestre Lu a posi��o 2 da chave, eles se encontrar�o nas
 * oitavas de final; se Mestre Kung ocupar a posi��o 6 e Mestre Kung ocupar a
 * posi��o 9 da chave, eles se encontrar�o somente na final.
 * 
 * Entrada A entrada consiste de duas linhas. A primeira linha da entrada cont�m
 * um inteiro K (1 <= K <= 16) que indica a posi��o de Mestre Kung na chave. A
 * segunda linha da entrada cont�m um inteiro L (1 <= L <= 16, K \(\ne \) L) que
 * indica a posi��o de Mestre Lu na chave.
 * 
 * Sa�da Seu programa deve produzir uma linha contendo uma das palavras
 * seguintes, decidindo a fase em que v�o se enfrentar os jogadores Mestre Kung
 * e Mestre Lu, se eles chegarem a se enfrentar: oitavas, quartas, semifinal ou
 * final.
 * 
 * 
 * Exemplos de Entrada Exemplos de Sa�da 10
 * 
 * 14
 * 
 * semifinal
 * 
 * 
 * 7
 * 
 * 8
 * 
 * oitavas
 * 
 * 
 * 3
 * 
 * 13
 * 
 * final
 * 
 * 
 * 5
 * 
 * 8
 * 
 * quartas
 * 
 * Olimp�ada Brasileira de Inform�tica � OBI2018 Fase 2
 * 
 * Para um conjunto de casos de testes valendo 30 pontos, K = 1.
 * 
 * @author phsg5
 *
 */
public class Desafio1_Copa {

	public static void main(String[] args) throws IOException {
		InputStreamReader vInput = new InputStreamReader(System.in);
		BufferedReader vBuffer = new BufferedReader(vInput);
		String[] vEntrada = vBuffer.readLine().split(" ");
		String vAlturaVisitante;
		int vCasosDeTeste = Integer.parseInt(vEntrada[0]);
		int vAlturaMinima = Integer.parseInt(vEntrada[1]);
		int vAlturaMaxima = Integer.parseInt(vEntrada[2]);
		int vTotal = 0;

		do {

			vAlturaVisitante = vBuffer.readLine();

			if (vAlturaVisitante != null && !vAlturaVisitante.equals("")) {
				int vAltura = Integer.parseInt(vAlturaVisitante);
				if (vAltura >= vAlturaMinima && vAltura <= vAlturaMaxima) {
					vTotal++;
				}
			}

		} while (vAlturaVisitante != null && !vAlturaVisitante.equals(""));

		System.out.println(vTotal);

	}

}