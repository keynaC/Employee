
    import java.time.LocalDate;
public class Employee {
	String name;
    int salary;
	LocalDate hireDate;

	Employee(String name, int salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	String getName() {
		return name;
	}
	int getSalary() {
		return salary;
	}
	LocalDate hireDate() {
		return hireDate;
	}
}

class Main{
	public static void main(String[] args) {
		Employee employee1 = new Employee("Roberta  ", 5000, LocalDate.parse("2021-04-01"));
		Employee employee2 = new Employee("Loyd Blair ", 70000, LocalDate.parse("2015-04-01"));
		Employee employee3 = new Employee("Magdalena ", 50000, LocalDate.parse("2011-04-01"));

		System.out.println("FIRST EMPLOYEE");
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary: " + employee1.getSalary());
		System.out.println("Hire Date: " + employee1.hireDate());
		
		System.out.println("SECOND EMPLOYEE");
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salary: " + employee2.getSalary());
		System.out.println("Hire Date: " + employee2.hireDate());
		
		System.out.println("THIRD EMPLOYEE");
		System.out.println("Name: " + employee3.getName());
		System.out.println("Salary: " + employee3.getSalary());
		System.out.println("Hire Date: " + employee3.hireDate());
	}
}
}
