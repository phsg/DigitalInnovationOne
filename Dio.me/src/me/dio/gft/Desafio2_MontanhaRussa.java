package me.dio.gft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todos os habitantes da Nlog�nia est�o super animados com a abertura do
 * Ricardo Barreiro World, o mais novo parque de divers�es do pa�s. Na TV e no
 * r�dio s� passam propagandas da montanha-russa do parque, a mais r�pida do
 * continente. � nela que todos, de crian�as a idosos querem andar.
 * 
 * Infelizmente foram impostas algumas restri��es no momento da homologa��o do
 * brinquedo pelo governo. Por quest�es de seguran�a, h� uma altura m�nima e uma
 * altura m�xima que as pessoam devem ter para poder passear na montanha-russa.
 * 
 * Para o dia da inaugura��o do parque, todos os convidados realizaram um
 * pr�-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a
 * opera��o do parque no primeiro dia, voc� foi contratado para fazer um
 * programa que dado o n�mero de visitantes, altura m�nima, altura m�xima e as
 * alturas de todos os visitantes, calcule quantas pessoas poder�o andar na
 * montanha-russa.
 * 
 * Entrada A entrada cont�m v�rios casos de teste. A primeira linha de cada caso
 * consiste em tr�s inteiros N (1 <= N <= 100), Amin e Amax (50 <= Amin <= Amax
 * <= 250), o n�mero de visitantes, a altura m�nima e m�xima em cent�metros para
 * andar na montanha-russa, respectivamente.
 * 
 * As N linhas seguintes cont�m, cada uma, um n�mero inteiro Ai (50 <= Ai <=
 * 250), a altura do i-�simo visitante, em cent�metros.
 * 
 * A entrada termina com fim-de-arquivo (EOF).
 * 
 * Sa�da Para cada caso de teste, imprima uma �nica linha com o n�mero
 * visitantes que podem passear na montanha-russa.
 * 
 * Exemplo de Entrada Exemplo de Sa�da 8 160 182 160 182 183 159 250 170 172 173
 * 
 * 5
 * 
 * @author phsg5
 *
 */
public class Desafio2_MontanhaRussa {

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