import java.util.Scanner;

public class BaseBallGame2 {

	int[] numArr = new int[3]; // 크기 3인 배열 생성(난수)
	int[] input = new int[3]; // 크기 3인 배열 생성(사용자 입력)

	// 난수 생성 메서드
	public void rand() {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
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
		int count = 0;

		int[] inputArr = new int[3];

		rand();
		
		while (true) {
			System.out.println("input number : ");
			for (int i = 0; i < inputArr.length; i++) {
				inputArr[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (inputArr[i] == inputArr[j]) { //중복 숫자를 입력하면 다시 입력하도록 출력
						System.out.println("Try again");
						i--;
						break;
					}
				}
			}
			//사용자 입력 배열과 난수생성 배열 비교
			for (int i = 0; i < inputArr.length; i++) { 
				for (int j = 0; j < numArr.length; j++) {
					if (inputArr[i] == numArr[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}count++;
					}
				}
			}
			//strike, ball 모두 0이면 out, 하나라도 있으면 해당 값 출력
			if (strike == 0 && ball == 0) {
				System.out.println("Out");
			} else {
				System.out.println("strike : " + strike + " / ball : " + ball);
			}
			//strike 3이 될때까지 반복
			if (strike != 3) {
				continue;
			} else {
				System.out.println("success!" + count + "회 도전했습니다");
				break;
			}
		}
	}

	public static void main(String[] args) {
		BaseBallGame2 bbg2 = new BaseBallGame2();
		bbg2.input();

	}

}
