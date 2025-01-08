package modulo_estrutura_condicional;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("BOM DIA");
			
		}
		else {
			if(hora < 18) {
				System.out.println("BOA TARDE");
				
			}else {
				System.out.println("Boa Noite");
				
			}
			
		}
		

	}

}
