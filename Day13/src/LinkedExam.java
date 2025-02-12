import java.util.Scanner;

public class LinkedExam {

	static LinkNode head;
	static LinkNode cur;
	static LinkNode newNode;
	static LinkNode del;

	public static void main(String[] args) {

		head = cur = newNode = new LinkNode();
		newNode.next = null;

		newNode.setData(1);
		// newNode.next = null;

		// newNode = new LinkNode();
		newNode.next = new LinkNode();
		newNode.next.setData(2);
		newNode.next.next = null;

		newNode.next.next = new LinkNode();
		newNode.next.next.setData(3);
		newNode.next.next.next = null;

		newNode.next.next.next = new LinkNode();
		newNode.next.next.next.setData(4);
		newNode.next.next.next.next = null;

		newNode = new LinkNode();
		newNode.next = head;
		head = newNode;

		newNode.setData(5);

		cur = head;
		// 출력
		while (cur != null) {
			System.out.println(cur.getData());
			cur = cur.next;
		}
		// 몇 번째 삽입할지?
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 번째 삽입?");
		int num = scanner.nextInt();
		System.out.println("어떤 숫자 삽입?");
		int num2 = scanner.nextInt();

		cur = head;

		for (int i = 1; i < num - 1; i++) {
			cur = cur.next;
		}

		newNode = new LinkNode();
		newNode.next = cur.next;
		cur.next = newNode;

		newNode.setData(num2);

		cur = head;
		// 출력
		while (cur != null) {
			System.out.println(cur.getData());
			cur = cur.next;
		}
		// 삭제
		System.out.println("몇 번째 삭제?");
		int delnum = scanner.nextInt();

		cur = head;

		for (int i = 1; i < num - 1; i++) {
			cur = cur.next;
		}

		del = cur.next;
		cur.next = cur.next.next;
		del.next = null;

		cur = head;
		// 출력
		while (cur != null) {
			System.out.println(cur.getData());
			cur = cur.next;
		}
		
		//머리노드 삭제
		System.out.println("머리노드 삭제할까요? 1. 삭제 / 2. 삭제안함");
		int delhead = scanner.nextInt();

		if (delhead == 1 && head != null) {
			head = cur = head.next;
		}
		cur = head;
		// 출력
		while (cur != null) {
			System.out.println(cur.getData());
			cur = cur.next;
		}

	}
}
