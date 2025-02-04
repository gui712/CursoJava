package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
	
		int n;
		double alturaTotal, alturaMedia, percentual;
		
		System.out.println("Quantas pessoas serao digitadas: ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }
		
		int numeroMenores = 0;
		alturaTotal = 0;
		
		for(int i=0; i<n;i++) {
			if(idades[i] < 16) {
				numeroMenores++;
			}
			alturaTotal += alturas[i];
		}
		
		alturaMedia = alturaTotal / n;
		
		 percentual = ((double)numeroMenores / n) * 100.0;

		 System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		 System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);

		    for(int i=0; i<n; i++) {
		        if (idades[i] < 16) {
		        	System.out.printf("%s\n", nomes[i]);
		        }
		    }
		
		
		sc.close();
	}

}
