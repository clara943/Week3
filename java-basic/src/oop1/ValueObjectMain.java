package oop1;

public class ValueObjectMain {
	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		valueData.add();
		valueData.add();
		valueData.add(); //인스턴스의 메서드를 호출하는 방법은 멤버 변수를 사용하는 방법과 동일하다. (dot)을 찍어서 객체 접근한 다음 원하는 메서드 호출하면 된다.
		System.out.println("최종 숫자=" + valueData.value);
		
	}
	


}
// 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
// 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
//	객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.