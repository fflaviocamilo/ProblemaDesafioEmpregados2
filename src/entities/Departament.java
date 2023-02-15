package entities;

import java.util.ArrayList;
import java.util.List;

public class Departament {
	
	private String name;
	private int payDay;
	private Address address;
	private List<Employee> employee = new ArrayList<Employee>();

	
	public Departament (String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}
	
	public Departament (String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addEmployee (Employee employee) {
		this.employee.add(employee);
	}
	public void removeEmployee (Employee employee) {
		this.employee.remove(employee);
	}
	public Double payroll() {
		double sum = 0.0;
		for (Employee employee : employee) {
			sum += employee.getSalary();
		}
		
		return sum;
	}



	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("___________________________ \n");
		sb.append("FOLHA DE PAGAMENTOS \n");
		sb.append("Departamento " );
		sb.append(name + " = ");
		sb.append(String.format("%.2f", payroll()) + "\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionarios : \n");
		for (Employee emp : employee) {
			sb.append(emp.getName() +  "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + address);
		return sb.toString();
	}
	
	
	

}
