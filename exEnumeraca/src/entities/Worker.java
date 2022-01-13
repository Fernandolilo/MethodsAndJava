package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLervel;

public class Worker {

	private String name;
	private WorkerLervel level;
	private Double baseSalary;

	private Department department;

	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLervel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLervel getLevel() {
		return level;
	}

	public void setLevel(WorkerLervel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * para add contratos não deixar o setList mas excluir para que não seja jogado
	 * uma nova lista dentro do banco de ados
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	/* para remover contratos da lista */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	/*
	 * HourContract c: class contracts lista dentro da class worker
	 */
	public double income(int year, int month) {
		double sum = baseSalary; //pega a base de salario e atribui a uma soma.
		
		Calendar cal = Calendar.getInstance(); // a class calendar esta pegando o instante,

		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); // a class calendar seta em date de "HourContract c" e busca as datas geradas.
			int c_year = cal.get(Calendar.YEAR); // para buscar um ano
			int c_month = 1 + cal.get(Calendar.MONTH); // para buscar um dado mes;
			if (year == c_year && month == c_month) { // testa se mes e ano existem, caso seja existente retorna a soma.
				sum += c.totalValues();
			}

		}
		return sum;
	}

}
