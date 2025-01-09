package modulo_repeticao;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int soma = 0;
		System.out.println("Digite um numero inteiro: ");
		int x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			System.out.println("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
		
		System.out.println("Encerrando o loop");
		System.out.println(soma);

		sc.close();
	}

}
