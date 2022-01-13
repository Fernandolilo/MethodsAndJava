package program;

public class Apllication {

	public static void main(String[] args) {
		/*
		 * desta forma tera exito no uso da função e permitirá o uso do LAMBDA, CASO EU
		 * TENTE IMPLEMENTAR MAIS UMA FUNÇÃO NA INTERFACE A PROTEÇÃO DO JAVA ME APONTARA
		 * QUE NÃO PODE SER EXECUTADO.
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
 * a funcional interface é uma protreção do java para tratar funções abstratas,
 * é uma forma de que caso alguem tente alterar algo, terá que alterar todas as
 * implementações.
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

