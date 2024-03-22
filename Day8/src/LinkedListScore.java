import java.util.*;

public class LinkedListScore {
    ArrayList<StudentScoreHasA> list = new ArrayList<>();
    Iterator<StudentScoreHasA> it = list.iterator();
    StudentScoreHasA stu;

    public void input() {// 1. 학생정보 입력
        Scanner sc = new Scanner(System.in);
        stu = new StudentScoreHasA();
        System.out.print("이름 : ");
        stu.setName(sc.next());
        System.out.print("국어점수 : ");
        stu.setKor(sc.nextInt());
        System.out.print("영어점수: ");
        stu.setEng(sc.nextInt());
        System.out.print("수학점수 : ");
        stu.setMat(sc.nextInt());
        list.add(stu);
        System.out.println("입력이 완료되었습니다. 초기화면으로 돌아갑니다.");
    }

    public void output() {
        for (StudentScoreHasA stu : list) {
            System.out.println(stu);
        }
    }

    public void modify() { // 수정
        Scanner sc = new Scanner(System.in);
        System.out.print("수정 할 이름 입력 : ");
        String n = sc.next();
        it = list.iterator();
        while (it.hasNext()) {
            StudentScoreHasA stu = (StudentScoreHasA) it.next();
            if (stu.getName().equals(n)) {
                System.out.println("아래 과목 중 성적을 수정하고싶은 과목을 고르세요");
                System.out.println("1번 국어 / 2번 영어 / 3번 수학");
                int sub = sc.nextInt();
                switch (sub) {
                    case 1:
                        System.out.println("국어: ");
                        stu.setKor(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("영어: ");
                        stu.setEng(sc.nextInt());
                        break;
                    case 3:
                        System.out.println("수학: ");
                        stu.setMat(sc.nextInt());
                        break;
                    default:
                        System.out.println("존재하지 않는 과목입니다");
                }
            }
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        if (stu == null) {
            System.out.println("삭제할 내역이 존재하지 않습니다");
        } else {
            System.out.println("삭제할 이름 검색: ");
            String n = sc.next();
            it = list.iterator();
            while (it.hasNext()) {
                StudentScoreHasA stu = it.next();
                if (stu.getName().equals(n)) {
                    list.remove(stu);
                }
            }
        }
    }

    // 4
    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 학생의 이름을 입력하여 주세요");
        String n = sc.next();
        it = list.iterator();
        while (it.hasNext()) {
            if (stu.getName().equals(n)) {
                System.out.println(stu);
            } else {
                System.out.println("검색하는 이름과 일치하는 학생이 없습니다.");
            }
        }
    }

    public void end() {
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListScore o = new LinkedListScore();
        boolean run = true;
        while (run) {
            System.out.println("1.입력 / 2.수정/ 3.삭제 /4.검색 / 5.종료");
            System.out.print("선택 :");
            int num;
            num = sc.nextInt();
            switch (num) {
                case 1:
                    o.input();
                    break;
                case 2:
                    o.modify();
                    break;
                case 3:
                    o.delete();
                    break;
                case 4:
                    o.search();
                    break;
                case 5:
                    o.end();
                    break;
            }
        }
    }
}