import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try { // 예상되는 예외를 인식

			int num = sc.nextInt();
			System.out.println(3 / num);

		} catch (ArithmeticException ae) { // 예외처리기
			// ae.printStackTrace();
			System.out.println("0으로 입력하지마...");
			return;

		} catch (Exception in) {
			System.out.println("제대로 입력해...");
		} finally {
			System.out.println("Bye");
		}

	}

}
