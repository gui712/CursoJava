package topicosJava;

public class DicasString {
	
	public static void main(String[] args) {
		
		String original ="abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "gui");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vet= s.split(" ");
		String word1 = vet[0];
		String word2 = vet[1];
		String word3 = vet[2];
		
		System.out.println("Original: -" + s01+"-");
		System.out.println("toLowerCase: -" + s01+"-");
		System.out.println("toUpperCase: -" + s02+"-");
		System.out.println("trim: -" + s03+"-");
		System.out.println("substring(2): -" + s04+"-");
		System.out.println("substring(2,9): -" + s05+"-");
		System.out.println("replace: -" + s06+"-");
		System.out.println("replace: -" + s07+"-");
		System.out.println("indexOf: -" + i +"-");
		System.out.println("LastindexOf: -" + j +"-");
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
