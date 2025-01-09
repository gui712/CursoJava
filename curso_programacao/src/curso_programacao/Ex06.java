package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
			
				int cod1, numPecas1, cod2, numPecas2;
				double valorUniPeca1 = 0;
				double valorUniPeca2 = 0;
				double preco;
				
				cod1 = sc.nextInt();
				numPecas1 = sc.nextInt();
				valorUniPeca1 = sc.nextDouble();
				cod2 = sc.nextInt();
				numPecas2 = sc.nextInt();
				valorUniPeca2 = sc.nextDouble();
				
				preco = (numPecas1 * valorUniPeca1) + (numPecas2 * valorUniPeca2);
				
				System.out.printf("VALOR A PAGAR: R$ %.2f", preco);
				
				
				
				
				sc.close();

	}

}
