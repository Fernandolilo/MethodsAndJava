package program;

public class Apllication {

	public static void main(String[] args) {
		/*
		 * desta forma tera exito no uso da fun��o e permitir� o uso do LAMBDA, CASO EU
		 * TENTE IMPLEMENTAR MAIS UMA FUN��O NA INTERFACE A PROTE��O DO JAVA ME APONTARA
		 * QUE N�O PODE SER EXECUTADO.
		 */

		/*
		 * desta forma podemos passar o valor direto, porem na interface teremos que
		 * pasar como void
		 */
		
		
		/*
		 * Funcao colocarPreFixoNaString = valor-> "Sr. "+valor;
		 * System.out.println(colocarPreFixoNaString.gerar("Fernando"));
		 */

		/*
		 * uma outra forma fazendo o uso do return;;;;
		 * neste caso a interface torna a ser um etodo com um retorno
		 */
		
		Funcao funcao = valor -> {
			return valor;
		};
		System.out.println(funcao.gerar("Fernando"));
	}
}

/*
 * a funcional interface � uma protre��o do java para tratar fun��es abstratas,
 * � uma forma de que caso alguem tente alterar algo, ter� que alterar todas as
 * implementa��es.
 */

/*
@FunctionalInterface
interface Funcao {
	String gerar(String valor);
}*/

/*
@FunctionalInterface
interface Funcao {
	void gerar(String valor);
}
*/

@FunctionalInterface
interface Funcao {
	String gerar(String valor);
}

