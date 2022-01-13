package program;

import java.util.HashMap;
import java.util.Map;



public class Application {
	//este metodo far� uso do cacha
	public static Map<Integer, Integer>MAPA_FATORIAL= new HashMap<>();
	public static void main(String[] args) {
		/* recursividade Na recursividade uma fun��o chama a si mesma, repetidamente,
		 * at� atingir uma condi��o de parada. No caso do Java, um m�todo chama a si
		 * mesmo, passnado para si objetos primitivos, Cada chamada gera uma nova
		 * entrada na pilha, de execu��o, e alguns dados podem ser disponibilizados em
		 * um escopo global, ou local, atrav�s de par�metros em um escopo global.
		 */

		//System.out.println(fatorial(5));
		
		//System.out.println(fatorialA(7));
		
		/*
		 * fazendo o uso agora de um mapeamento de cach...
		 */
		long i = System.nanoTime();
		System.out.println(fatorialMemorization(5));
		long f = System.nanoTime();
		System.out.println("Fatorial 1: "+(f-i));
		
		i = System.nanoTime();
		System.out.println(fatorialMemorization(5));
		f = System.nanoTime();
		System.out.println("Fatorial 2: "+(f-i));
		
	}

	/*public static int fatorial (int value) {
		if(value == 1) {
			return value;
		}else {
			return value * fatorial(value -1);
		}
	}*/
	
	
	/*
	 * fazendo a implementa��o do TailCall  
	 * efeito distp �q ue diminue a pilha de execu��o.
	 */
	
	/*public static double fatorialA(double valor) {
		return fatorialComTaiCall(valor, 1);
	}
	
	public static double fatorialComTaiCall(double valor, double numero) {
		if(valor ==0) {
			return numero;
		}
		return fatorialComTaiCall(valor -1, numero * valor);
	}*/
	
	public static Integer fatorialMemorization(Integer value) {
		if(value == 1) {
			return value;
		}else {
			if(MAPA_FATORIAL.containsKey(value)) {
				return MAPA_FATORIAL.get(value);
			}else {
				Integer resultado = value * fatorialMemorization(value -1);
				return resultado;
			}
				
		}
	}
}
