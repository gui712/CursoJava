package curso_programacao;

import java.util.Locale;

public class Aula01 {

	public static void main(String[] args) {


		System.out.println("Ola Mundo!!");
		
		int y = 32;
		double x = 10.35748;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000;
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f\n", x);
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome,idade,renda);
		

	}

}
