package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Departament;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do departamento:");
		String departamento = sc.next();

		System.out.print("Dia do pagamento:");
		Integer day = sc.nextInt();

		System.out.print("Email:");
		String email = sc.next();

		System.out.print("Telefone:");
		String tel = sc.next();

		Address address = new Address(email, tel);

		Departament departament = new Departament(departamento, day, new Address(email, tel));

		System.out.print("Quantos funcionários tem o departamento?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + " : ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeFuncionario = sc.nextLine();

			System.out.print("Salario: ");
			Double salarioFuncionario = sc.nextDouble();

			Employee employee = new Employee(nomeFuncionario, salarioFuncionario);

			departament.addEmployee(employee);
		}

		showReport(departament);

	}

	private static void showReport(Departament departament) {

		System.out.println(departament);
	}

}
