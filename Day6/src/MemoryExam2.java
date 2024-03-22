import java.util.Scanner;

public class MemoryExam2 {

	public static void main(String[] args) {

		MyStack2 ms = new MyStack2();
		MyQueue2 mq = new MyQueue2();
		Memory2 m;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1.Stack 2.Queue 3.exit");
			int num = sc.nextInt();

			if (num == 1) {
				m = ms;
			} else if (num == 2) {
				m = mq;
			} else
				break;

			while (true) {
				System.out.print("1.push 2.pop 3.back");

				int n = sc.nextInt();

				if (n == 1) {
					m.push(sc.nextInt());

				} else if (n == 2) {
					System.out.println(m.pop());
				} else
					break;
			}

		} while (true);
	}

}
