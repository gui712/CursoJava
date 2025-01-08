package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExAula03 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Digite o raio do ciculo: ");
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("Area = %.4f", area);
		
		sc.close();
		

	}

}
