package tandemloop;

public class Calculator {
	public static void operation(String method, int a, int b) {
		String operation = method;

		if (operation.equalsIgnoreCase("add")) {
			int value = a + b;
			System.out.println(value);
		} else if (operation.equalsIgnoreCase("sub")) {
			if (a > b) {
				int value = a - b;
				System.out.println(value);
			} else {
				int value = b - a;
				System.out.println(value);
			}
		} else if (operation.equalsIgnoreCase("mul")) {
			int value = a * b;
			System.out.println(value);
		} else if (operation.equalsIgnoreCase("div")) {

			try {
				int value = a / b;
				System.out.println(value);
			} catch (ArithmeticException e) {
				System.out.println("can not be devided by 0");
			}
		}
	
	}

	public static void main(String[] args) {
		operation("div", 0, 10);

	}

}
