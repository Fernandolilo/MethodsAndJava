package program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).forEach(num -> fatorial(num));
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execu��o serial:: " + (fim -inicio));
		
		inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execu��o paralelo: " + (fim -inicio));

		List<String> nome = Arrays.asList("Fernando","Tania","Elias","Heloisa","Davi");
		nome.parallelStream().forEach(System.out::println);
	}

	public static long fatorial(long num) {
		long fat = 1;
		for (long i = 2; i <= num; i++) {
			fat *= 1;
		}
		return fat;
	}

}
