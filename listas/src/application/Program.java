package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add("Jessica");
		list.add("Josiane");
		list.add(2, "Bob");
		System.out.println(list.size());
		System.out.println("Lista Completa");
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("------------------------");
		//list.remove("Josiane");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'J');
		System.out.println("Lista Com remoçoes");
		System.out.println(list.size());
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Maria " + list.indexOf("Maria"));
		System.out.println("------------------------");
		
		List<String> result	= list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String nome : result) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);


		
	}

}
