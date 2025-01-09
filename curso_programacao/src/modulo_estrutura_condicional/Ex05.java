package modulo_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtdItem;
		double preco;
		
		System.out.println("Digite o codigo: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qtdItem = sc.nextInt();
		
		if(codigo == 1) {
			preco = qtdItem * 4.00;
			System.out.println("Total: " + preco);
		}else if(codigo == 2) {
			preco = qtdItem * 4.50;
			System.out.println("Total: " + preco);
		}else if(codigo == 3) {
			preco = qtdItem * 5.00;
			System.out.println("Total: " + preco);
		}else if(codigo == 4) {
			preco = qtdItem * 2.00;
			System.out.println("Total: " + preco);
		}else if(codigo == 5) {
			preco = qtdItem * 1.50;
			System.out.println("Total: " + preco);
		}else {
			System.out.println("Codigo inexistente");
		}
		
		sc.close();

	}

}
