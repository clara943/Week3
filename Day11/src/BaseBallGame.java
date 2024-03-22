import java.util.Scanner;

public class BaseBallGame {

	int[] numArr = new int[3]; // 크기 3인 배열 생성(난수 생성)
	int[] input = new int[3]; // 크기 3인 배열 생성(사용자 입력)

	// 난수 생성 메서드
	public void rand() {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 1~9까지 난수 생성
		}

		if (numArr[0] == numArr[1] || numArr[1] == numArr[2] || numArr[2] == numArr[0]) {
			rand();
		}

	}

	// 사용자 입력 메서드
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;

		int[] inputArr = new int[3];

		rand(); // 난수 생성
		while (true) {
			System.out.println("input number : "); // 사용자가 숫자 입력
			for (int i = 0; i < inputArr.length; i++) {
				inputArr[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (inputArr[i] == inputArr[j]) {
						System.out.println("Try again"); // 중복된 수이면 다시 하라고 출력
						i--;
						break;
					}
				}
			}
			strike = 0;
			ball = 0;

			for (int i = 0; i < inputArr.length; i++) {
				for (int j = 0; j < numArr.length; j++) {
					if (inputArr[i] == numArr[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}

			if (strike == 0 && ball == 0) {
				System.out.println("Out");
			} else {
				System.out.println("strike : " + strike + " / ball : " + ball);
			}

			if (strike != 3) {
				continue;
			} else {
				System.out.println("success!!!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		BaseBallGame baseball = new BaseBallGame();
		baseball.input();
	}
}