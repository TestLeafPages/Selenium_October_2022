package week1.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	String[] names = {"Arun","Tamil","Chandru","Padma","Manon"};
	int[] numbers = {12,8,6,4,45,75,88};
	int length = names.length;
	System.out.println(length);
	Arrays.sort(names);
	for(int i = 0; i < length; i++)
	System.out.println(names[i]);
	
	
	System.out.println("------------------------------------");
	String[] employees = new String[6];
	employees[0] = "Swetha";
	employees[1] = "Mohan";
	employees[2] = "Kathiravan";
	
	
	
}
}
