package programa;

import java.util.Scanner;

public class Progrma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vet = new double [n];
		
		for(int i=0; i<n; i++) {
			vet [i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i =0; i<n; i++) {
			soma += vet[i];
		}
		double avg = soma /3;
		
		System.out.printf("AVEREGE HEIGTH: %.2f%n" , avg);
		
		sc.close();

	}

}
