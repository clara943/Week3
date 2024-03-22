
public class InnerClassExam01 {

	private int a;
	private static int b;

	public void dispTest() {
		class Test {

			public void disp() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		Test test = new Test();
		test.disp();
	}

	public static void main(String[] args) {
		InnerClassExam01 inner = new InnerClassExam01();
		inner.dispTest();
		
//		InnerClassExam01 inner = new InnerClassExam01();
//		InnerClassExam01.Test test = inner.new Test();

		// InnerClassExam01.Test test = new InnerClassExam01().new Test();

		// test.disp();

	}

}
