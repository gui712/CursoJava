package curso_programacao;

import java.util.Scanner;

public class ExAula02 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de " + a + " + " + b + " = " + soma);
		
		
		
		

		sc.close();
	}

}
