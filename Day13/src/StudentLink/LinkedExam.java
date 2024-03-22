package StudentLink;

import java.util.Scanner;

public class LinkedExam {

	static StudentInfo head;
	static StudentInfo cur;
	static StudentInfo newNode;
	static StudentInfo del;
	static StudentInfo temp;

	Scanner sc = new Scanner(System.in);

	public LinkedExam() {
		// head = cur = newNode = new Student_Info(name, kor, eng, mat);
		head = cur = newNode = del = null;
	}

	public void add() {
		cur = head;
		System.out.println("[정보 입력] ");
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어 성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("수학 성적 입력: ");
		int mat = sc.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = sc.nextInt();
		newNode = new StudentInfo(name, kor, mat, eng);

		ListAdd(newNode);
	}

	public void ListAdd(StudentInfo newNode) {

		cur = head;

		if (head == null) {
			head = newNode;
		} else {
			while (cur != null) {
				if (cur.getAvg() < newNode.getAvg()) {
					break;
				}
				temp = cur;
				cur = cur.next;
			}
			if (cur == head) {
				head = newNode;
				newNode.next = cur;
			} else {
				temp.next = newNode;
				newNode.next = cur;
			}
		}
	}

	public void del(Scanner sc) {
		cur = head;
		String x = sc.next();
		if (cur.getName().equals(x)) {
			del = head;
			head = head.next;
		} else {
			while (true) {
				if (cur.next.getName().equals(x)) {
					del = cur.next;
					cur.next = cur.next.next;
					break;
				}
				cur = cur.next;
			}
		}
		del.next = null;
		del = null;

		System.out.println("[삭제완료]");
		prt();
	}

	public void prt() {
		cur = head;
		// 출력
		while (cur != null) {
			cur.show();
			cur = cur.next;
		}

	}

	public void prt_pickme(Scanner sc) {
		cur = head;
		// 특정 학생 출력
		System.out.println("조회할 학생 이름을 입력하세요: ");
		String x = sc.next();
		while (true) {
			if (cur.getName().equals(x)) {
				break;
			}
			cur = cur.next;
		}
		cur.show();
	}

	public void prt_avgover(Scanner sc) {
		cur = head;
		// 특정 학생 출력
		System.out.println("평균을 입력하세요: ");
		int x = sc.nextInt();

		while (cur != null) {
			if (cur.getAvg() >= x) {
				cur.show();
			}
			cur = cur.next;
		}

	}

	public void modify(Scanner sc) {
		cur = head;
		System.out.println("수정할 학생 이름을 입력하세요: ");
		String x = sc.next();

		while (cur != null) {
			if (cur.getName().equals(x)) {
				break;
			}
			temp = cur;
			cur = cur.next;
		}

		if (cur == head) {
			head = cur.next;
		} else {
			temp.next = cur.next;
		}

		System.out.println("[수정 정보 입력] ");
		System.out.print("이름 입력: ");
		cur.setName(sc.next());
		System.out.print("국어 성적 입력: ");
		cur.setKor(sc.nextInt());
		System.out.print("수학 성적 입력: ");
		cur.setMat(sc.nextInt());
		System.out.print("영어 성적 입력: ");
		cur.setEng(sc.nextInt());
		System.out.println("===================================");
		cur.show();

		cur.next = null;
		ListAdd(cur);

	}

}