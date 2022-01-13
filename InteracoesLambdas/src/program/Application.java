package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		String[] nomes = { "Fernando", "Tania", "Elias", "heloisa", "Davi" };
		Integer[] numeros = { 1, 2, 3, 4, 5 };
		imprimirNomesFiltrados(nomes);
		imprimirTodosOsNomes(nomes);
		imprimirTodosOsNumeros(numeros);
		
		List<String> profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor");
		profissoes.add("Testador");
		profissoes.add("Tecnico de Implantação");
		profissoes.add("Vendedor");
		
		profissoes.stream()
				  .filter(profissao -> profissao.startsWith("Tecnico"))
				  .forEach(System.out::println);
			

	}

	public static void imprimirTodosOsNomes(String... nomes) {
		for (String nome : nomes) {
			System.out.println(nome);
		}
		Stream.of(nomes).forEach(nome -> System.out.println(nome));
	}

	public static void imprimirTodosOsNumeros(Integer... numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero * 2);
		}
		Stream.of(numeros).forEach(numero -> System.out.println(numero));
		Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
	}

	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaIprimir = " ";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Tania")) {
				nomesParaIprimir = nomes[i];
			}
		}
		System.out.println(nomesParaIprimir);

		String nomesParaImprimirStream = Stream.of(nomes).filter(nome -> nome.equals("Fernando"))
				.collect(Collectors.joining());
		System.out.println(nomesParaImprimirStream);
	}

}
