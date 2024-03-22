import java.util.Scanner;

public class Final {

	static Scanner sc = new Scanner(System.in);
	public static FTEmployee[] fs = new FTEmployee[100];
	public static PTEmployee[] ps = new PTEmployee[100];
	public static int PTnum = 0;
	public static int FTnum = 0;

	// 정규직 정보입력
	public static void ftinput() {

		if(FTnum >= 100) {
			return;
		}

		fs[FTnum] = new FTEmployee();
  
		System.out.println("직원정보입력");
		System.out.println("이름:");
		
		fs[FTnum].EmpInfo.name = sc.next();
		System.out.println("주소:");
		fs[FTnum].EmpInfo.address = sc.next();
		System.out.println("은행:");
		fs[FTnum].EmpInfo.bank = sc.next();
		System.out.println("직급:");
		fs[FTnum].setGrade(sc.next());
		System.out.println("나이:");
		fs[FTnum].EmpInfo.age = sc.nextInt();
		System.out.println("생일:");
		fs[FTnum].EmpInfo.birthinfo = sc.nextInt();
		System.out.println("직원번호:");
		fs[FTnum].EmpInfo.id = sc.nextInt();
		System.out.println("전화번호:");
		fs[FTnum].EmpInfo.phone = sc.nextInt();
		System.out.println("계좌번호:");
		fs[FTnum].EmpInfo.account = sc.nextInt();
		System.out.println("노동조합가입여부: 가입(1) 미가입(2)");
		fs[FTnum].setLabor(sc.nextInt());
		
		System.out.println("급여정보입력");
		System.out.println("기본급:");
		fs[FTnum].EmpPay.setBase(sc.nextInt());
		FTnum++;

	}

	// 비정규직 정보입력
	public static void psinput() {
	

		if(PTnum >= 100) {
			return;
		}

		ps[PTnum] = new PTEmployee();
  
		System.out.println("직원정보입력");
		System.out.println("이름:");
		//fs[num].EmpInfo.setName(sc.next());
		ps[PTnum].EmpInfo.name = sc.next();
		System.out.println("주소:");
		ps[PTnum].EmpInfo.address = sc.next();
		System.out.println("은행:");
		ps[PTnum].EmpInfo.bank = sc.next();
		System.out.println("나이:");
		ps[PTnum].EmpInfo.age = sc.nextInt();
		System.out.println("생일:");
		ps[PTnum].EmpInfo.birthinfo = sc.nextInt();
		System.out.println("사원번호:");
		ps[PTnum].EmpInfo.id = sc.nextInt();
		System.out.println("전화번호:");
		ps[PTnum].EmpInfo.phone = sc.nextInt();
		System.out.println("계좌번호:");
		ps[PTnum].EmpInfo.account = sc.nextInt();
		System.out.println("계약기간:");
		ps[PTnum].setTerm(sc.nextInt());
		System.out.println("퇴사일자:");
		ps[PTnum].setLastdate(sc.nextInt());

		System.out.println("급여정보입력");
		System.out.println("기본급:");
		ps[PTnum].EmpPay.setBase(sc.nextInt());

		PTnum++;

	}

	// 정규직 정보 출력
	public static void fsoutput(int i) {
		//for (int i = 0; i < FTnum; i++) {
			System.out.println(fs[i].EmpInfo.name);
			System.out.println(fs[i].EmpInfo.address);
			System.out.println(fs[i].EmpInfo.bank);
			System.out.println(fs[i].EmpInfo.age);
			System.out.println(fs[i].EmpInfo.birthinfo);
			System.out.println(fs[i].EmpInfo.id);
			System.out.println(fs[i].EmpInfo.phone);
			System.out.println(fs[i].EmpInfo.account);
			System.out.println(fs[i].getLabor());
			System.out.println(fs[i].getGrade());

			System.out.print("기본급 :");
			System.out.println(fs[i].EmpPay.getBase());
			System.out.print("직무급 :");
			System.out.println(fs[i].EmpPay.getAdd());
			System.out.print("세금 :");
			System.out.println(fs[i].EmpPay.getTax());
			System.out.print("세전총액 :");
			System.out.println(fs[i].EmpPay.getSum());
			System.out.print("세후총액 :");
			System.out.println(fs[i].EmpPay.getTotal());

		//}
	}

	// 비정규직 정보 출력
	public static void psoutput(int i) {
		//for (int i = 0; i < PTnum; i++) {
			System.out.println(ps[i].EmpInfo.name);
			System.out.println(ps[i].EmpInfo.address);
			System.out.println(ps[i].EmpInfo.bank);
			System.out.println(ps[i].EmpInfo.age);
			System.out.println(ps[i].EmpInfo.birthinfo);
			System.out.println(ps[i].EmpInfo.id);
			System.out.println(ps[i].EmpInfo.phone);
			System.out.println(ps[i].EmpInfo.account);
			System.out.println(ps[i].getTerm());
			System.out.println(ps[i].getLastdate());

			System.out.print("기본급 :");
			System.out.println(ps[i].EmpPay.getBase());
			System.out.print("직무급 :");
			System.out.println(ps[i].EmpPay.getAdd());
			System.out.print("세금 :");
			System.out.println(ps[i].EmpPay.getTax());
			System.out.print("세전총액 :");
			System.out.println(ps[i].EmpPay.getSum());
			System.out.print("세후총액 :");
			System.out.println(ps[i].EmpPay.getTotal());

		//}
	}
	// 정규직 정보 변경

	public static void fmodify() {
		int id;
		Boolean ret = false;
		int i;
		System.out.println("변경할 직원의 사원번호를 입력");
		id = sc.nextInt();

		for (i = 0; i < FTnum; i++) {
			if (id == fs[i].EmpInfo.id) {
				ret = true;
				break;
			}
		}

		if (ret == true) {
			System.out.println("수정할 내용을 입력하세요");
			System.out.println("이름:");
			fs[i].EmpInfo.name = sc.next();
			System.out.println("주소:");
			fs[i].EmpInfo.address = sc.next();
			System.out.println("은행:");
			fs[i].EmpInfo.bank = sc.next();
			System.out.println("직급:");
			fs[i].setGrade(sc.next());
			System.out.println("나이:");
			fs[i].EmpInfo.age = sc.nextInt();
			System.out.println("생일:");
			fs[i].EmpInfo.birthinfo = sc.nextInt();
			System.out.println("직원번호:");
			fs[i].EmpInfo.id = sc.nextInt();
			System.out.println("전화번호:");
			fs[i].EmpInfo.phone = sc.nextInt();
			System.out.println("계좌번호:");
			fs[i].EmpInfo.account = sc.nextInt();
			System.out.println("노동조합가입여부: 가입(1) 미가입(2)");
			fs[i].setLabor(sc.nextInt());
	
			System.out.println("급여정보입력");
			System.out.println("기본급:");
			fs[i].EmpPay.setBase(sc.nextInt());

		} else {
			System.out.print("해당 직원이 없습니다.");
		}
	}

	// 비정규직 정보 변경

	public static void pmodify() {
		int id;
		Boolean ret = false;
		int i;
		System.out.println("변경할 직원의 사원번호를 입력");
		id = sc.nextInt();

		for (i = 0; i < PTnum; i++) {
			if (id == ps[i].EmpInfo.id) {
				ret = true;
				break;
			}
		}

		if (ret == true) {
			System.out.println("수정할 내용을 입력하세요");
			System.out.println("이름:");
			ps[i].EmpInfo.name = sc.next();
			System.out.println("주소:");
			ps[i].EmpInfo.address = sc.next();
			System.out.println("은행:");
			ps[i].EmpInfo.bank = sc.next();
			System.out.println("나이:");
			ps[i].EmpInfo.age = sc.nextInt();
			System.out.println("생일:");
			ps[i].EmpInfo.birthinfo = sc.nextInt();
			System.out.println("사원번호:");
			ps[i].EmpInfo.id = sc.nextInt();
			System.out.println("전화번호:");
			ps[i].EmpInfo.phone = sc.nextInt();
			System.out.println("계좌번호:");
			ps[i].EmpInfo.account = sc.nextInt();
			System.out.println("계약기간:");
			ps[i].setTerm(sc.nextInt());
			System.out.println("퇴사일자:");
			ps[i].setLastdate(sc.nextInt());
	
			System.out.println("급여정보입력");
			System.out.println("기본급:");
			ps[i].EmpPay.setBase(sc.nextInt());
	

		} else {
			System.out.print("해당 직원이 없습니다.");
		}
	}

	// 정규직 전체 출력
	public static void fprintAll() {
		for (int i = 0; i < FTnum; i++) {
			fsoutput(i);
		}
	}

	// 비정규직 전체 출력
	public static void pprintAll() {
		for (int i = 0; i < PTnum; i++) {
			psoutput(i);
		}
	}

	// 정규직 검색
	public static void fsearch() {
		int menu;
		String name;
		int id;

		System.out.println("1. 사원번호 검색, 2. 이름검색");
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("검색할 직원의 사원번호를 입력하세요");
			id = sc.nextInt();

			for (int i = 0; i < FTnum; i++) {
				if (id == fs[i].EmpInfo.id) {
					System.out.println(fs[i].EmpInfo.name);
					System.out.println(fs[i].EmpInfo.address);
					System.out.println(fs[i].EmpInfo.bank);
					System.out.println(fs[i].EmpInfo.age);
					System.out.println(fs[i].EmpInfo.birthinfo);
					System.out.println(fs[i].EmpInfo.id);
					System.out.println(fs[i].EmpInfo.phone);
					System.out.println(fs[i].EmpInfo.account);
					System.out.println(fs[i].getLabor());
					System.out.println(fs[i].getGrade());
		
					System.out.print("기본급 :");
					System.out.println(fs[i].EmpPay.getBase());
					System.out.print("직무급 :");
					System.out.println(fs[i].EmpPay.getAdd());
					System.out.print("세금 :");
					System.out.println(fs[i].EmpPay.getTax());
					System.out.print("세전총액 :");
					System.out.println(fs[i].EmpPay.getSum());
					System.out.print("세후총액 :");
					System.out.println(fs[i].EmpPay.getTotal());
					return;
				}

			}
			System.out.println("해당 직원이 없습니다.");
		} else if (menu == 2) {
			System.out.println("직원 이름을 입력하세요");
			name = sc.next();

			for (int i = 0; i < FTnum; i++) {
				if (name.equals(fs[i].EmpInfo.name)) {
					System.out.println(fs[i].EmpInfo.name);
					System.out.println(fs[i].EmpInfo.address);
					System.out.println(fs[i].EmpInfo.bank);
					System.out.println(fs[i].EmpInfo.age);
					System.out.println(fs[i].EmpInfo.birthinfo);
					System.out.println(fs[i].EmpInfo.id);
					System.out.println(fs[i].EmpInfo.phone);
					System.out.println(fs[i].EmpInfo.account);
					System.out.println(fs[i].getLabor());
					System.out.println(fs[i].getGrade());
		
					System.out.print("기본급 :");
					System.out.println(fs[i].EmpPay.getBase());
					System.out.print("직무급 :");
					System.out.println(fs[i].EmpPay.getAdd());
					System.out.print("세금 :");
					System.out.println(fs[i].EmpPay.getTax());
					System.out.print("세전총액 :");
					System.out.println(fs[i].EmpPay.getSum());
					System.out.print("세후총액 :");
					System.out.println(fs[i].EmpPay.getTotal());
					return;
				}
			}

		} else {
			System.out.println("잘못된 검색 방법 입니다.");
		}
	}

	// 비정규직 검색
	public static void psearch() {
		int menu;
		String name;
		int id;

		System.out.println("1. 사원번호 검색, 2. 이름검색");
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("검색할 직원의 사원번호를 입력하세요");
			id = sc.nextInt();

			for (int i = 0; i < PTnum; i++) {
				if (id == ps[i].EmpInfo.id) {
					System.out.println(ps[i].EmpInfo.name);
					System.out.println(ps[i].EmpInfo.address);
					System.out.println(ps[i].EmpInfo.bank);
					System.out.println(ps[i].EmpInfo.age);
					System.out.println(ps[i].EmpInfo.birthinfo);
					System.out.println(ps[i].EmpInfo.id);
					System.out.println(ps[i].EmpInfo.phone);
					System.out.println(ps[i].EmpInfo.account);
					System.out.println(ps[i].getTerm());
					System.out.println(ps[i].getLastdate());
		
					System.out.print("기본급 :");
					System.out.println(ps[i].EmpPay.getBase());
					System.out.print("직무급 :");
					System.out.println(ps[i].EmpPay.getAdd());
					System.out.print("세금 :");
					System.out.println(ps[i].EmpPay.getTax());
					System.out.print("세전총액 :");
					System.out.println(ps[i].EmpPay.getSum());
					System.out.print("세후총액 :");
					System.out.println(ps[i].EmpPay.getTotal());
					return;
				}

			}
			System.out.println("해당 직원이 없습니다.");
		} else if (menu == 2) {
			System.out.println("직원 이름을 입력하세요");
			name = sc.next();

			for (int i = 0; i < PTnum; i++) {
				if (name.equals(ps[i].EmpInfo.name)) {
					System.out.println(ps[i].EmpInfo.name);
					System.out.println(ps[i].EmpInfo.address);
					System.out.println(ps[i].EmpInfo.bank);
					System.out.println(ps[i].EmpInfo.age);
					System.out.println(ps[i].EmpInfo.birthinfo);
					System.out.println(ps[i].EmpInfo.id);
					System.out.println(ps[i].EmpInfo.phone);
					System.out.println(ps[i].EmpInfo.account);
					System.out.println(ps[i].getTerm());
					System.out.println(ps[i].getLastdate());
		
					System.out.print("기본급 :");
					System.out.println(ps[i].EmpPay.getBase());
					System.out.print("직무급 :");
					System.out.println(ps[i].EmpPay.getAdd());
					System.out.print("세금 :");
					System.out.println(ps[i].EmpPay.getTax());
					System.out.print("세전총액 :");
					System.out.println(ps[i].EmpPay.getSum());
					System.out.print("세후총액 :");
					System.out.println(ps[i].EmpPay.getTotal());
					return;
				}
			}

		} else {
			System.out.println("잘못된 검색 방법 입니다.");
		}
	}

	// 정규직 삭제
	public static void fdelete() {
		if (FTnum == 0) {
			System.out.println("삭제할 내역이 없습니다.");
		} else {
			int j;
			System.out.print("삭제할 직원번호 검색:");
			int id = sc.nextInt();
			for (int i = 0; i < FTnum; i++) {
				if (id == fs[i].EmpInfo.id) {
					fs[i] = null;

					for (j = i; j < FTnum-1; j++)
						fs[j] = fs[j+1];
					
					FTnum--;
					break;
				}
			}
		}
	}

	// 비정규직 삭제
	public static void pdelete() {
		if (PTnum == 0) {
			System.out.println("삭제할 내역이 없습니다.");
		} else {
			int j;
			System.out.print("삭제할 직원번호 검색:");
			int id = sc.nextInt();
			for (int i = 0; i < PTnum; i++) {
				if (id == ps[i].EmpInfo.id) {
					for (j = i; j < PTnum - 1; j++) {
						ps[j] = ps[j + 1];
					}
					ps[j] = null;
					PTnum--;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int choose;
		int ftorpt;
		int button;
		int password;

		while (true) {
			System.out.println("1.직원용 2.관리자용");
			System.out.print("선택:");
			choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("1.정규직 2.비정규직");
				ftorpt = sc.nextInt();
				if (ftorpt == 1) {
					fsearch();
				} else if (ftorpt == 2) {
					psearch();
				}
				break;
			case 2:
				System.out.println("관리자 비밀번호를 입력하세요");
				password = sc.nextInt();
				if (password == 0000) {
				System.out.println("1.정규직 2.비정규직");
				ftorpt = sc.nextInt();
				if (ftorpt == 1) {
					System.out.println("1.입력 2.수정 3.삭제 4.출력 5.검색 6.종료");
					button = sc.nextInt();
					if (button == 1) {
						ftinput();
					}

					if (button == 2) {
						fmodify();
					}

					if (button == 3) {
						fdelete();

					}
					if (button == 4) {
						fprintAll();
					}
					if (button == 5) {
						fsearch();
					}
					if (button == 6) {
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					}
//					else {
//						System.out.println("잘못된 접근입니다.");
//					}
				}
				if (ftorpt == 2) {
					System.out.println("1.입력 2.수정 3.삭제 4.출력 5.검색 6.종료");
					button = sc.nextInt();
					if (button == 1) {
						psinput();
					}

					if (button == 2) {
						pmodify();
					}

					if (button == 3) {
						pdelete();

					}
					if (button == 4) {
						pprintAll();
					}
					if (button == 5) {
						psearch();
					}
					if (button == 6) {
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					} 
//						else {
//						System.out.println("잘못된 접근입니다.");
//					}
				} break;
			} else {
				System.out.println("잘못된 비밀번호입니다.");
			}
			}
		}
	}
}
