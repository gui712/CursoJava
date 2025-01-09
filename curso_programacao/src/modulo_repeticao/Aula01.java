package modulo_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("Area = " + area);
		System.out.println("Preco = " + preco);
		

		sc.close();
	}

}
