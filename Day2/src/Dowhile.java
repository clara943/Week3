
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);

		float num1 = 0, num2 = 0, result = 0;
		String op = "";
		char re;

		do {

			System.out.print("첫번째 수 입력 : ");
			num1 = sc.nextFloat();
			System.out.print("두번째 수 입력 : ");
			num2 = sc.nextFloat();
			System.out.print("사칙연산기호 입력 : ");
			op = sc.next();

			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				System.out.println("잘못된 연산자 입력!");
				break;
			}
			System.out.println("계산 결과:" + result);

			System.out.println("한 번 더 수행?");
			re = sc.next().charAt(0);
		} while (Character.toLowerCase(re) == 'y'); // while (ans == 'Y' || ans == 'y');
	}
}
