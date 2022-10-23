package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] inputs = {10,20,30,20,40,30};
		
		Set<Integer> values = new LinkedHashSet<Integer>();
		
		for (int temp : inputs) {
			
			if(!values.add(temp)) {
			System.out.println(temp);}
			
		}
		
		System.out.println(values);

	}

}
