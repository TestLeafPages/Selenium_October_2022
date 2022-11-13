package week7.day2;

import org.testng.annotations.Test;

public class LearnString {
	@Test
	public void run() {
		String name1 = "testleaf"; // -> String Literal
		String name2 = new String("testleaf"); // -> String Object
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		int length = name1.length();
		System.out.println(length);
		String upperCase = name1.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		// String comparison
		System.out.println("===String Comparison===");
		boolean equals = name1.equals(name2);
		System.out.println(equals);
		boolean equalsIgnoreCase = upperCase.equalsIgnoreCase(lowerCase);
		System.out.println(equalsIgnoreCase);
		boolean contains = name1.contains("estl");
		System.out.println(contains);
		boolean startsWith = name1.startsWith("tes");
		System.out.println(startsWith);
		boolean endsWith = name1.endsWith("af");
		System.out.println(endsWith);
		System.out.println("===String Concatination===");
		String concat = name1.concat(" Chennai");
		System.out.println(concat);
		String updatedName = "Chennai "+name1;
		System.out.println(updatedName);
		System.out.println("===String Retrival===");
		for (int i = 0; i < name1.length(); i++) {
			char charAt = name1.charAt(i);
			System.out.println(charAt);
		}
		char[] array = name1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		String name3 = "Testleaf is in Chennai.";
		String[] strArray = name3.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		String substring = name1.substring(3);
		System.out.println(substring);
		String substring1 = name1.substring(3,6);
		System.out.println(substring1);
		String name4 = "    Test     leaf    ";
		String trim = name4.trim();
		System.out.println(name4);
		System.out.println(trim);
		System.out.println("===String Replacement===");
		String replace = name1.replace('e', 'E');
		System.out.println(replace);
		String name5 = "Since 2005";
		String replaceAll = name5.replaceAll("\\D", "");
		System.out.println(replaceAll);
		
	}
}
