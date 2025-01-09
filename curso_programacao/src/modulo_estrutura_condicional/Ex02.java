package modulo_estrutura_condicional;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
