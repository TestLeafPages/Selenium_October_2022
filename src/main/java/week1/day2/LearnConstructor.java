package week1.day2;

public class LearnConstructor {
	public LearnConstructor(String name) {
		System.out.println("Received a name "+name);
	  }
public static void main(String[] args) {
	LearnConstructor obj = new LearnConstructor("Testleaf"); // This will give the ref of the class
	System.out.println("This is from main method");
}
}
