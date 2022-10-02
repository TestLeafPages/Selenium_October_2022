package week1.day2;

public class LearnConditionalStatements {
public static void main(String[] args) {
	int age = 4;
	if(age>=18) {
		System.out.println("Can Cast their vote");
	} else {
		System.out.println("Not eligible to vote");
	}
	System.out.println("-----------------------------------");
	
	int mark = 109;
	if (mark >= 80) {
		System.out.println("First class");
	} else if(mark >= 60) {
		System.out.println("Second class");
	} else if(mark >= 35) {
		System.out.println("Average");
	} else {
		System.out.println("Fail");
	}
	
	System.out.println("-----------------------------------");
	
	String ticketType = "TC";
	// Balcony, FC, SC
	switch (ticketType) {
	case "Balcony":
		System.out.println("Ticket costs Rs. 250");
		break;
	case "FC":
		System.out.println("Ticket costs Rs. 200");
		break;
	case "SC":
		System.out.println("Ticket costs Rs. 150");
		break;
	default:
		System.out.println("Please give a relevant option");
		break;
	}
	
	
	
	
	
	
	
}
}
