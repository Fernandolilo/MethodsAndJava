package program;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {

	public static void main(String[] args) {
		/*
		 * consumer no lambda
		 */
		/*
		 * Consumer<String> imprimirUmaFrase = System.out::println; //Consumer<String>
		 * imprimirUmaFrase = frase -> System.out.println(frase);
		 * imprimirUmaFrase.accept("Hello word!");
		 */

		/*
		 * fazendo uso fas functions, fazendo uso da API do java, podemos efetuar
		 * funções diretamente com a function
		 */

		/*
		 * Function<String, String> retornarNomeContrario = texto -> new
		 * StringBuilder(texto).reverse().toString(); Function<String, Integer>
		 * converterParaInteiro = string -> Integer.valueOf(string) * 2;
		 * 
		 * System.out.println(retornarNomeContrario.apply("Fernando"));
		 * System.out.println(converterParaInteiro.apply("20"));
		 */

		/*
		 * Predicado verifica os parametros e retorna um boolean caso esteja vazio
		 * retorna true, caso estaja com algo retorna false.
		 */

		/*
		 * Predicate<String> estaVazio = valor -> valor.isEmpty(); Predicate<String>
		 * estaVazioo = String::isEmpty; System.out.println(estaVazio.test(""));
		 * System.out.println(estaVazio.test("Fernando"));
		 * System.out.println(estaVazioo.test(""));
		 * System.out.println(estaVazioo.test("Fernando"));
		 *
		 */

		/*
		 * fazendo uso do supridor...
		 */

		/*
		 * estamos instancioando uma nova pessoa.
		 */

		Supplier<Pessoa> instaciarPessoa = () -> new Pessoa();
		Supplier<Pessoa> instaciarPessoa2 = Pessoa::new;

		/*
		 * fazendo a busca desta nova pessoa.
		 */
		System.out.println(instaciarPessoa.get());
		System.out.println(instaciarPessoa2.get());

	}

}

/*
 * fazendo a instancia de uma nova pessoa....
 */
class Pessoa {
	private String nome;
	private Integer idade;

	public Pessoa() {
		nome = "Fernando";
		idade = 35;
	}

	/*
	 * neste caso é necessário criar um toString, por que o System.out.println vai
	 * procurar por um toString, do contrario o supridor, vai ir procurar pelo
	 * object e não encontrando nos retorna um hash sem os valores instanciados;;;;
	 */
	@Override
	public String toString() {
		return String.format("nome: %s, idade: %d anos", nome, idade);
	}
}
