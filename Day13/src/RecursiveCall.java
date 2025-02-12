import java.util.Scanner;

public class RecursiveCall {

	static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	static int forfactorial(int a) {
		int result = a;

		for (int i = a; i > 1; i--) {
			result *= (i - 1);
		}

		return result;

	}

	static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");

		int x = scanner.nextInt();
		return x;
	}

	public static void main(String[] args) {

		System.out.println(factorial(input()));
		System.out.println(forfactorial(input()));

	}
}
