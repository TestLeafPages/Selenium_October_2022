package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Fazil");
	list.add("Pradeep");
	list.add("Siva");
	list.add("Azar");
	list.add("Srisha");
	list.add("Siva");
	list.add("Dinesh");
	// Insertion in list
	list.add(2, "Prakash Raj");
	// Update in the list
	list.set(0, "Udhay");
	// Delete a value
	list.remove("Siva");
	System.out.println(list);
	System.out.println(list.size());
	Collections.sort(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	Collections.reverse(list);
	System.out.println("----------------------");
	
	for(String name:list) {
		System.out.println(name);
	}
	boolean contains = list.contains("Siva");
	System.out.println(contains);
	list.clear();
	boolean empty = list.isEmpty();
	System.out.println(empty);
	
	
	
	
	
	
	
	
}
}
