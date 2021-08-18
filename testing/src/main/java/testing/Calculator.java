package testing;

public class Calculator {
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		if(a>2) {
			System.out.println("hello");
		}
		return a+b;
	}
	
	public double divide(double a, double b) {
		return a/b;
	}

}
