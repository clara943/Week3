import java.util.Scanner;

/*

 * public static float 함수명(int 파라미터) {

 * 		파라미터 * 3.0

 * 		return float

 * }

 * */

public class ArrayExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사람 수 입력

		System.out.print("사람 수 입력 :");

		int count = sc.nextInt();

		// 변수 선언 초기화

		String[] names = new String[count];

		int[][] score = new int[count][4];

		float[] avg = new float[count];

		// 입력

		input(names, score, avg);

		// 출력

		output(names, score, avg);

	}

	// 입력

	public static void input(String[] names, int[][] score, float[] avg) {

		Scanner sc = new Scanner(System.in);

		// 입력 이름, 국, 영, 수 * count

		for (int i = 0; i < names.length; i++) {

			System.out.print("이름 입력 :");

			names[i] = sc.next();

			for (int j = 0; j < 3; j++) {

				System.out.print("점수 입력 :");

				score[i][j] = sc.nextInt();

			}

			score[i][3] = score[i][0] + score[i][1] + score[i][2];

			avg[i] = score[i][3] / 3;

		}

	}

	// 출력

	public static void output(String[] names, int[][] score, float[] avg) {

		// 출력 이름, 국, 영, 수, 총점, 평균 * count

		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i]);

			for (int j = 0; j < 4; j++) {

				System.out.print(", " + score[i][j]);

			}

			System.out.println(", " + avg[i]);

		}

	}

}