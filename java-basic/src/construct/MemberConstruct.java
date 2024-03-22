package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	// 추가
	//첫번째 생성자 내부에서 두번째 생성자 호출한다
	MemberConstruct(String name, int age) {
		this(name, age, 50); // this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다 / this()는 생성자 코드 첫 줄에만 작성할 수 있다

	}

	MemberConstruct(String name, int age, int grade) { // 생성자
		System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

// 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
// 생성자는 반환 타입이 없다. 비워두어야 한다.
// 나머지는 메서드와 같다.