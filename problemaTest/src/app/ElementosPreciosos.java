package app;

import java.util.HashSet;
import java.util.*;

public class ElementosPreciosos {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        
        List<String> pedras = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            pedras.add(scanner.nextLine());
        }
        
        System.out.println(encontrarElementosPreciosos(pedras));
        
        scanner.close();
    }

    public static int encontrarElementosPreciosos(List<String> pedras) {
        Set<Character> elementosComuns = new HashSet<>();
        for (char c : pedras.get(0).toCharArray()) {
            elementosComuns.add(c);
        }
        
        for (int i = 1; i < pedras.size(); i++) {
            Set<Character> elementosNaPedra = new HashSet<>();
            for (char c : pedras.get(i).toCharArray()) {
                elementosNaPedra.add(c);
            }
            elementosComuns.retainAll(elementosNaPedra);
        }
        
        return elementosComuns.size();
    }
}

