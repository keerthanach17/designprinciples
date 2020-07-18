
public class SubCalculator {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		if(a<b) {
			int t=a;
			a=b;
			b=a;
		}
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		if(a<b) {
			int t=a;
			a=b;
			b=a;
		}
		return a/b;
	}
}
