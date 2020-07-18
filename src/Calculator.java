import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCalculator ob = new SubCalculator();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Choose your operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int op = sc.nextInt();
		String ch = "y";
		while(ch.equals("y")){
			switch(op) {
			case 1: System.out.println(ob.add(a, b));
			break;
			case 2: System.out.println(ob.sub(a, b));
			break;
			case 3: System.out.println(ob.multiply(a, b));
			break;
			case 4: System.out.println(ob.divide(a, b));
			break;
			default:System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.nextLine();
		}
	}

}
