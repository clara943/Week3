/*
 * is~a 관계 : 상속관계
 * extends : 상속표현
 * 자바는 클래스(객체)는 단일상속만 허용, 인터페이스는 다중상속 가능
 * 다중상속을 쓰면 모호성이 발생함 -> 여러군데에서 돈 받으면 이게 누구 돈인지 몰라
 * 
 */

class A{
	
	public A() {
		
		//super(); <- 이게 숨겨져있는 것
		System.out.println("Super class");
	}
	
}

public class IsAExam01 extends A {
	
	public IsAExam01() {
		
		//부모의 생성자를 호출
		super(); //주석해도 같은 결과 도출됨
		System.out.println("Sub class");
	}
	/*
	 * public String toString() { 
	 * return getClass().getName() + "@" + Integer.toHexString(hashCode()); } // 이게 오버라이딩
	 */	 
//	 public String toString() {
//	        return super.toString()+"Superman"; //부모껏도 쓰고 + 내 Superman도 쓰고
//	    }

	public static void main(String[] args) {
		
		IsAExam01 isa = new IsAExam01();
		
//		System.out.println(isa); //클래스이름과 주소값 출력
//		System.out.println(isa.toString()); //상속 받았기 때문에 object에 있는 toString()을 쓰고 있는 것
//		isa.disp();
	}

}
