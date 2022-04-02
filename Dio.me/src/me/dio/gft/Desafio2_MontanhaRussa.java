package me.dio.gft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todos os habitantes da Nlogônia estão super animados com a abertura do
 * Ricardo Barreiro World, o mais novo parque de diversões do país. Na TV e no
 * rádio só passam propagandas da montanha-russa do parque, a mais rápida do
 * continente. É nela que todos, de crianças a idosos querem andar.
 * 
 * Infelizmente foram impostas algumas restrições no momento da homologação do
 * brinquedo pelo governo. Por questões de segurança, há uma altura mínima e uma
 * altura máxima que as pessoam devem ter para poder passear na montanha-russa.
 * 
 * Para o dia da inauguração do parque, todos os convidados realizaram um
 * pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a
 * operação do parque no primeiro dia, você foi contratado para fazer um
 * programa que dado o número de visitantes, altura mínima, altura máxima e as
 * alturas de todos os visitantes, calcule quantas pessoas poderão andar na
 * montanha-russa.
 * 
 * Entrada A entrada contém vários casos de teste. A primeira linha de cada caso
 * consiste em três inteiros N (1 <= N <= 100), Amin e Amax (50 <= Amin <= Amax
 * <= 250), o número de visitantes, a altura mínima e máxima em centímetros para
 * andar na montanha-russa, respectivamente.
 * 
 * As N linhas seguintes contém, cada uma, um número inteiro Ai (50 <= Ai <=
 * 250), a altura do i-ésimo visitante, em centímetros.
 * 
 * A entrada termina com fim-de-arquivo (EOF).
 * 
 * Saída Para cada caso de teste, imprima uma única linha com o número
 * visitantes que podem passear na montanha-russa.
 * 
 * Exemplo de Entrada Exemplo de Saída 8 160 182 160 182 183 159 250 170 172 173
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