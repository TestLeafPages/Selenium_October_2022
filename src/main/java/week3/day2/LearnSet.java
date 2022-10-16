package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> names = new TreeSet<String>();
	names.add("Francis");
	names.add("Elango");
	names.add("Chandru");
	names.add("Bala");
	names.add("George");
	names.add("Arun");
	names.add("Bala");
	names.add("Deepa");
	names.remove("Deepa");
	System.out.println(names);
	for (String eachName : names) {
		System.out.println(eachName);
	}
	// convert set -> list
//	List<String> list = new ArrayList<String>(names);
	List<String> list = new ArrayList<String>();
	list.addAll(names);






}
}
