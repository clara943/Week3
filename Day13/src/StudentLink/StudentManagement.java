package StudentLink;

import java.util.Scanner;

public class StudentManagement {
	Scanner sc;
	private int func; // 서비스 항목 선택 값
	private int func2; // 관리현황 조회 내 기능 선택 값
	LinkedExam le;

	public StudentManagement() {
		sc = new Scanner(System.in);
		func = 1;
		func2 = 1;
		le = new LinkedExam();
	}

	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();

		System.out.println("안녕하세요, 성적관리 시스템입니다.");

		do {
			System.out.println("[서비스 항목]");
			System.out.println("1.성적 입력 2. 성적 조회 3. 성적 삭제 4. 관리 현황 조회 5. 성적 수정 6. 종료 ");
			System.out.print("항목 선택: ");
			sm.func = sm.sc.nextInt();

			switch (sm.func) {
			case 1:
				sm.le.add();
				break;

			case 2:
				sm.le.prt();
				break;

			case 3:
				System.out.print("[삭제 기능]삭제할 학생 이름을 입력하세요: ");
				sm.le.del(sm.sc);
				break;

			case 4:
				System.out.println("[상세 조회]");
				System.out.println("1. 특정 학생 조회 2. 특정 평균 이상 학생 조회");
				System.out.println("항목 입력: ");
				sm.func2 = sm.sc.nextInt();
				switch (sm.func2) {
				case 1:
					sm.le.prt_pickme(sm.sc);
					break;
				case 2:
					sm.le.prt_avgover(sm.sc);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;

			case 5:
				sm.le.modify(sm.sc);
				break;
			case 6:
				System.out.println("성적관리 시스템을 종료하겠습니다");
				System.out.println("감사합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		} while (sm.func != 6);

	}

}
