package modulo_repeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.println("Digite sua senha novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permito!!");

		sc.close();
	}

}
