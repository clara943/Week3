/*

 * instance method

 * -객체 생성 후 사용가능 메소드

 * static method

 * -객체 유무와 상관없이 사용가능 메소드

 */ 

public class CallByName {



	public static void main(String[] args) {



		disp2();

		

		CallByName cbn = new CallByName();


		cbn.disp1();

		cbn.disp2();

		

		int num = 100;

		

		num = cbn.disp3(num) ;

		System.out.println(num);

		

		String str = new String("Superman");

		// System.out.println(str);

		

		cbn.disp4(str); // 바로 밑에 함수 호출 str을 아래로 보냈음. callbyreperence는 주소를 복사.



	}

	

	public void disp4(String s) {

		System.out.println(s);

	}

	public int disp3(int num) {

		

		System.out.println(num);

		num++;

		System.out.println(num);

		

		return num;

	}

	

	public void disp1() { //call by name

		System.out.println("call by name 1");

	}

	public static void disp2() { //call by name

		System.out.println("call by name 2");

	}

}