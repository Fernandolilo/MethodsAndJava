package entities;

public class Emplyoee {

	private Integer id;
	private String name;
	private Double salary;
	private Double increment;

	public Emplyoee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setIncrement(Double increment) {
		this.increment = increment;
	}

	public Double getIncrement() {
		return increment;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setIncrementSalary(Double salary) {
		this.salary += salary * (increment / 100);
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
