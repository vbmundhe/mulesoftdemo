package javademo;

public class MyCalculator {
	int a;
	int b;
	
	public MyCalculator() {
		super();
	}
	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public static int add (int a, int b) {
		return a+b;
	}
	public  int sub (int a, int b) {
		return a-b;
	}
	
	public  int multiply () {
		return a*b;
	}
}
