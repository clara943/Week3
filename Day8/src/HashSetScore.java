import java.util.*;

public class HashSetScore {
    Set<StudentScoreHasA> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void input() {
        StudentScoreHasA stu = new StudentScoreHasA();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어점수: ");
        int eng = sc.nextInt();
        System.out.print("수학점수 : ");
        int mat = sc.nextInt();
        stu.setName(name);
        stu.setKor(kor);
        stu.setEng(eng);
        stu.setMat(mat);
        set.add(stu);
        System.out.println("입력이 완료되었습니다. 초기화면으로 돌아갑니다.");
    }

    public void output() {
        for (StudentScoreHasA stu : set) {
            System.out.println(stu);
        }
    }

    public void modify() {
        System.out.print("수정 할 이름 입력 : ");
        String name = sc.next();
        boolean found = false;
        for (StudentScoreHasA stu : set) {
            if (stu.getName().equals(name)) {
                found = true;
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
                break; 
            }
        }
        if (!found) {
            System.out.println("해당 학생의 정보를 찾을 수 없습니다.");
        }
    }

    public void delete() {
        System.out.println("삭제할 이름 검색: ");
        String name = sc.next();
        Iterator<StudentScoreHasA> iterator = set.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            StudentScoreHasA stu = iterator.next();
            if (stu.getName().equals(name)) {
                iterator.remove();
                found = true;
                System.out.println("삭제되었습니다.");
                break; 
            }
        }
        if (!found) {
            System.out.println("해당 학생의 정보를 찾을 수 없습니다.");
        }
    }

    public void search() {
        System.out.println("검색할 학생의 이름을 입력하여 주세요");
        String name = sc.next();
        boolean found = false;
        for (StudentScoreHasA stu : set) {
            if (stu.getName().equals(name)) {
                System.out.println(stu);
                found = true;
                break; // No need to continue looping once found
            }
        }
        if (!found) {
            System.out.println("검색하는 이름과 일치하는 학생이 없습니다.");
        }
    }

    public void end() {
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSetScore o = new HashSetScore();
        boolean run = true;
        while (run) {
            System.out.println("1.입력 / 2.수정/ 3.삭제 /4.검색 / 5.종료");
            System.out.print("선택 :");
            int num = sc.nextInt();
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
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}
