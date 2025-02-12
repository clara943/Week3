package class1;

public class ClassStart5 {

	public static void main(String[] args) {
		Student student1 = new Student(); // 객체 또는 인스턴스 생성: new 클래스명(), Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻
		student1.name = "학생1"; // student1 객체의 name 멤버 변수에 값 대입, 객체에 접근하려면 .(dot) 키워드를 사용하면 된다
		student1.age = 15;
		student1.grade = 90;

		Student student2 = new Student(); // 객체 또는 인스턴스 생성
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		Student[] students = new Student[] { student1, student2 };

		for (int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
		}

	}

}

// Student student1 = new Student(); 1. Student 객체 생성
// Student student1 = x001; 2. new Student()의 결과로  x001 참조값 반환
// student1 = x001; 3. 최종결과