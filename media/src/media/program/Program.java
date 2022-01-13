package media.program;

import java.util.Scanner;

import media.entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do Aluno: ");
		Aluno aluno = new Aluno();		
		aluno.name = sc.nextLine();
		
		System.out.print("Digite a primeira media: ");
		aluno.media1 = sc.nextDouble();
		
		System.out.print("Digite a segunda media: ");
		aluno.media2 = sc.nextDouble();
		
		System.out.print("Digite a terceira media: ");
		aluno.media3 = sc.nextDouble();
		
		System.out.print("Digite a quarta media: ");
		aluno.media4 = sc.nextDouble();
		
		System.out.println("Media: " + aluno.Media());
		System.out.print(aluno.toString());
		System.out.printf("%.2f", aluno.Aprovado());
		
		
		
		sc.close();
				
	}

}
