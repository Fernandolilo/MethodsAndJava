package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Appication {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios deseja registrar? ");
		System.out.println();
		System.out.println("How many employees will be registred? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.println();
		System.out.println("Entre com o  funcionarios deseja aumentar o Salario? ");
		System.out.println();
		System.out.println("Enter the employee id that will have salary increse? ");

		int idsalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		// Integer pos = position(list, idsalary);

		if (emp == null) {
			System.out.print("This id does noet exist! ");
		} else {

			System.out.print("Enter the percentage:  ");
			Double percent = sc.nextDouble();
			emp.increseSalary(percent);
		}
		System.out.println("List of Employees! ");
		for (Employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;

	}
}
