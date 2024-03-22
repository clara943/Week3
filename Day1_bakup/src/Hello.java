/*
 * java는 100% 상속구조
 * java는 100% 객체지향언어이다 -> 무조건 객체를 사용. -> class
 * 
 * 시작과 끝을 담당하는 함수 => main함수
 * 함수 => function => method 
 * 
 * 이름 규칙
 * 1. 클래스 : 첫글자는 대문자로 작성
 * 2. 메소드, 변수 : 소문자 작성 -> 상수를 저장하는 메모리 공간
 * 3. 상수 : 전부 대문자 MAX -> 변하지 않는 값
 * 4. 단어와 단어가 이어질때 두번째 단어의 첫글자는 대문자로 작성 blackWhite, BlackWhite
 * 
 * DataType
 * 1. 
 * 		문자형 char 2byte
 * 		정수형 byte short(2byte) int(4byte) long
 * 		실수형 float double(8byte)
 * 2. Reference Type : 레퍼런스 변수를 사용
 * 		- 배열
 * 		- 객체
 * 		- enum.
 * 
 * Casting
 * 1. 자동형변환 ex 3 + 4.2 => int + double 이므로 error => 3.0 + 4.2 로 casting이 일어나서 7.2 값 도출, 서로 다른 타입을 가지고 연산을 할 때 발생
 * 2. 강제형변환 ex 3 / 4 = 0 => int / int=int 이므로 0 나옴 => (double) 3 / (double) 4 = 0.75, double 하나 빼도 자동형변환 일어나므로 괜찮다 
 * 
 */
//패키지
//임포트 : api 가져다 쓰겠다
//import java.lang.*; // java폴더 밑에 있는 lang폴더 밑에 있는 모든 파일 가져오겠다.
import java.util.Scanner;

public class Hello {

	public static void main(String []args) {  // 프로그램을 시작해주고 끝내줌.
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = sc.nextInt();
		
		System.out.println(str);
		System.out.println(num);
		
		// datatype 변수명 ;
		// 변수명 = 값;  == 초기화 / = : 우변을 좌변에 대입하겠다
		// 변수 - 지역변수 local variable : method 안에 선언되어지는 변수
									// : 지역변수는 항상 꼭 초기화를 해야한다.
		
		//int num; 
		//num = 10;
		
		char ch = 'A'; // "" 문자열
		
		int y;
		y = 4 * 5 + 3;
		float z;
		z = (float) 5/2;
		
		//System.out.println(num);
		System.out.println((int)ch);
		System.out.println(y);
		System.out.println(z);
		
		Hello hello; // hello는 레퍼런스변수
		hello = new Hello(); // 객체생성
		
		
	}
}

class OperatorEx1 {
	public static void main(String args[]) {
		int i=5;
		i++;
		System.out.println(i);
		
		i=5;
		++i;
		System.out.println(i);
	}
}

class OperatorEx2 {
	public static void main(String args[]) {
		
		
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i +", j="+j);
		System.out.println("Hello");
		System.out.println(333);
		System.out.print("Hello" +3333);
		System.out.print(333);
		
		i=5;
		j=0;
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+j);
	}
}



