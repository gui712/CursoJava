package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble(); //ele vem com o separador usando a virgula para mudar precisa colocar o Locale
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
