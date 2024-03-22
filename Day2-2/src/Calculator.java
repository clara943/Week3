import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int num1, num2;
		double result = 0;
		String op; // +,-,*,/

		Scanner sc = new Scanner(System.in);

		// 입력기능수행 = 메소드
		// 메소드 호출

		num1 = Calculator.inputInt(sc);

		op = Calculator.inputString(sc);

		num2 = Calculator.inputInt(sc);

		// 연산함수 호출
		switch (op) {
		case "+":
			result = Calculator.add(num1, num2);
			break;
		case "-":
			result = Calculator.sub(num1, num2);
			break;
		case "*":
			result = Calculator.mul(num1, num2);
			break;
		case "/":
			result = Calculator.div(num1, num2);
			break;
		}

		// 출력함수 호출
		Calculator.disp(num1, op, num2, result);

	}

	public static void disp(int num1, String op, int num2, double result) {
		System.out.print(num1 + "" + op + "" + num2 + "=" + result);
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static double div(int n1, int n2) {
		double result = (double) n1 / n2;
		return result;
	}

	public static int inputInt(Scanner sc) { // sc =
		int num = sc.nextInt();
		return num;
	}

	public static String inputString(Scanner sc) {
		String s = sc.next();
		return s;
	}

}
