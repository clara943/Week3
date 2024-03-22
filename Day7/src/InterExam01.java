
public class InterExam01 implements CCC {

	public static void main(String[] args) {
		CCC inter = new InterExam01(); //동적바인딩, CCC는 AAA와 BBB를 상속받아 disp()와 disp2()에 대해 알고있으므로 에러 안남
		//InterExam01 inter = new InterExam01(); -> 정적바인딩
		inter.disp();
		inter.disp2();
		//inter.disp3(); <- 알고있는 함수만 쓸 수 있으므로 에러남
	}
	
	public void disp3() {
		System.out.println("Disp3");
	}

	@Override
	public void disp() {
		System.out.println("Disp");
		
	}

	@Override
	public void disp2() {
		System.out.println("Disp2");
		
	}

}
