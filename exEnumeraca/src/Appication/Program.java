package Appication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLervel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLervel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i = 1; i<n; i++) {
			System.out.println("Enter contract #"+ i + "data: ");
			System.out.print("Data: (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Values per hour");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			int hour = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hour);
			worker.addContract(contract);			
		}
		System.out.print("Enter mont ad year to calculate income: (MM/YYYY): ");
		String monthAndYear = sc.next();
		int mont = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, mont)));
		sc.close();
	}

}
