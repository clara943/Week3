import java.util.Scanner;

public class Fibonacci {

	static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");

		int x = scanner.nextInt();
		return x;
	}

	static int fibonacci(int n) {
		if (n > 2) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else {
			return n - 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(input()));

	}

}
