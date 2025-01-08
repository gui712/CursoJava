package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExAula05 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcular o salario

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		int hours;
		double priceHours;
		double salary;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		priceHours = sc.nextDouble();
		salary = hours * priceHours;
		
		System.out.println("Number: = " + number);
		System.out.printf("Salary: = U$ %.2f",  salary);


		sc.close();
	}

}
