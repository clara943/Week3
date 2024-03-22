
/*
 * 세사람의 성적처리프로그램
 * 입력: 이름, 국, 영, 수
 * 연산: 총점, 평균
 * 출력: 이름, 국,영,수,총점,평균
 */
import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();

		String[] name = new String[num]; // 이름
		int[][] score = new int[num][4]; // 국, 영, 수, 총
		float[] avg = new float[num];

		for (int j = 0; j < num; j++) {
			// 입력: 이름, 국, 영, 수
			System.out.print("Name input: ");
			name[j] = sc.next();

			for (int i = 0; i < 3; i++) {
				System.out.print("Score input: ");
				score[j][i] = sc.nextInt();

				score[j][3] += score[j][i]; //각 과목 점수를 총점에 더함
			}
			avg[j] = score[j][3] / 3.f;
		}
		for (int j = 0; j < num; j++) {
			System.out.print(name[j] + "\t");
			for (int i = 0; i < 4; i++) {
				System.out.print(score[j][i] + "\t");
			}
			System.out.println(avg[j]);
		}
	}
}
