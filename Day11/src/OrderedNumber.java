import java.util.Scanner;

public class OrderedNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 X와 Y 입력 받기
		System.out.print("변수 X를 입력하세요 (100 이상, 9,999,999 이하): ");
		int x = sc.nextInt();
		System.out.print("변수 Y를 입력하세요 (X 이상, 9,999,999 이하): ");
		int y = sc.nextInt();

		// 정돈된 수 출력
		System.out.println("X와 Y 사이의 모든 정돈된 수:");

		int count = 0; // 정돈된 수의 개수 카운트

		for (int i = x; i <= y; i++) {
			if (isOrderedNumber(i)) {
				System.out.println(i);
				count++;
			}
		}

		// 전체 갯수 출력
		System.out.println("전체 정돈된 수의 개수: " + count);
	}

	// 정돈된 수인지 확인하는 메서드
	public static boolean isOrderedNumber(int num) {
		
		String strNum = Integer.toString(num);

		// 각 자리수가 왼쪽부터 오름차순인지 확인
		for (int i = 0; i < strNum.length() - 1; i++) {
			if (strNum.charAt(i) >= strNum.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}
}
