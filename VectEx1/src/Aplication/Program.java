package Aplication;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Rooms[] vect = new Rooms[n];
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room]= new Rooms(name,email);
		}
		for(int i =0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i +": "+vect[i]);
			}
		}
			
		
		
		sc.close();
		
	}

}
