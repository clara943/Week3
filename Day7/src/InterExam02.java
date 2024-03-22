
public class InterExam02 {
	
	private int a;
	
	public void dispInter() {
		new AAA() {

			@Override
			public void disp() {
				System.out.println(a);

			}

		}.disp();; //anonymous inner class
	}
	public static void main(String[] args) {
		InterExam02 inter = new InterExam02();
		inter.dispInter();
	}
}
