package week3.day1;

public class LearnStatic {

	int a = 5;
	static int b = 5;

	public void increase() {
		a = a + 5;
	}
	
	public static void staticInc() {
		b = b + 5;
	}

	public static void main(String[] args) {
		LearnStatic obj1 = new LearnStatic();
		System.out.println(obj1.a);
		System.out.println(b);
		obj1.increase();
		System.out.println("a -> " +obj1.a);
		staticInc();
		System.out.println("b -> " +b);
		LearnStatic obj2 = new LearnStatic();
		obj2.increase();
		System.out.println("a Obj1-> " +obj1.a);
		System.out.println("a Obj2-> " +obj2.a);


	}
}
