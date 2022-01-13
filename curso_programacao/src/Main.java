import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String y, x, z;
		int i;
		// o sc.nextLine(); permite que seja digitado um texto por exemplo,
		// porem você não pode pular para a linha de baixo,
		// caso pule será armazenado em outra variavel;

		i = sc.nextInt();		
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		//quando efetuamos uma quebra de linha, utilizano o nextLine,
		//por padrão o programa ja consome esta quebra de linha,
		//dexando assim a variavel vazia.
		
		System.out.println("Dados digitados: ");
		System.out.println(i);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
				

	}

}
