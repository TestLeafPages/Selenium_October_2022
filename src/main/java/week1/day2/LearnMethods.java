package week1.day2;

public class LearnMethods {
	
	int a = 5; // Global Variable
	
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printMyName();
		String output = obj.getMyName();
		System.out.println(output);
		int sum = obj.addTwoNumbers(7, 8);
		System.out.println(sum);
	}

	public void printMyName() {
		System.out.println("Balaji");
	}
	
	private String getMyName() {
		String name = "Testleaf";
		return name;
	}
	
	int addTwoNumbers(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
}
