package week1.day1;

public class LearnForLoop {
public static void main(String[] args) {
	int a = -1, b = 1, c;
	for(int i=1; i <= 10; ++i) {
		c = a+b;
		System.out.println(c);
		a = b;
		b = c;
	}
	System.out.println("*********************************");
	for (int j = 10; j >= 1; j--) {
		System.out.println(j);
	}
}
}
