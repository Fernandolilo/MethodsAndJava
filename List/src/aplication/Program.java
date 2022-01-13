package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Fernando");
		list.add("Tania");
		list.add("Elias");
		list.add("Heloisa");
		list.add("Davi");
		list.add("Bete");
		list.add("San");
		list.add("Elvis");
		list.add(1, "Fernando Silva");
		
		System.out.println(list.size());
		
		//VARE A LISTA E IMPRIME
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("===============================");
		// VARRE ALISTA E PROCURA DADOS INICIAIS COM LETRA T
		list.removeIf(x -> x.charAt(0) =='T');
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("===============================");
		//PROCURA A POSIÇÃO DO NOME, CASO NÃO EXISTA RETORNA NULL
		System.out.println("Index of Tania: " + list.indexOf("Tania"));
		System.out.println("Index of Valmir: " + list.indexOf("Valmir"));
		
		System.out.println("===============================");
		
		//percore a list e procura dados com a INICIAL 'F' NO CASO A SOLICITADA
		List<String> result = list.stream().filter(x -> x.charAt(0) =='F').collect(Collectors.toList());
		
		for(String x: result) {
			System.out.println(x);
		}
		System.out.println(result);
		System.out.println("===============================");
		
		// encontrar um elemento com base no predicado
		String name = list.stream().filter(x -> x.charAt(0) =='J').findFirst().orElse(null);
		System.out.println(name);
		
	}
}
