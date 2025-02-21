package application;

import java.time.LocalDate;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1090, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DElIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DElIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		

	}

}
