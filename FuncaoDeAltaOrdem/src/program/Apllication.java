package program;

class Apllication {

	/*
	 * Função de Alta ordem
	 * 
	 * É uma função que retorna uma outra função ou que receba como paramentro uma
	 * função
	 */

	public static void main(String[] args) {

		/*
		 * efetuando o calculo da operação, passando pr parâmetro o calculo
		 */
		Calculo soma = (a, b) -> a + b;
		Calculo sub = (a, b) -> a - b;
		Calculo mult = (a, b) -> a * b;
		Calculo div = (a, b) -> a / b;

		System.out.println(executarOperacao(soma, 2, 3));
		System.out.println(executarOperacao(sub, 3, 3));
		System.out.println(executarOperacao(mult, 2, 3));
		System.out.println(executarOperacao(div, 4, 1));
	}
	/*
	 * coportamento da equação....
	 */

	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calculo(a, b);
	}

}

/*
 * Esta interface assina o meu médtodo. lebrando que uma funcional interface tem
 * apenas um metodo abastrato....
 */
@FunctionalInterface
interface Calculo {
	public int calculo(int a, int b);

}