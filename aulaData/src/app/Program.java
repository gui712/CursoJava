package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d01 = LocalDate.now();
		System.out.println("Local date = "+ d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Date time = " + d02 );
		
		Instant d03 = Instant.now(); //fuso horario GMT por causa do Z no final
		System.out.println("Instant = " + d03);
		
		LocalDate d04 = LocalDate.parse("2025-02-10");
		System.out.println("Data formatada = " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2025-02-10T19:00:20");
		System.out.println("Data formatada = " + d05);
		
		Instant d06 = Instant.parse("2025-02-10T19:00:20Z");
		System.out.println("Data formatada = " + d05);
		
		Instant d07 = Instant.parse("2025-02-10T19:00:20-03:00:00");
		System.out.println("Data formatada = " + d07);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d08 = LocalDate.parse("20/02/2025", fmt1);
		System.out.println("Data formatada = " + d08);


	}

}
