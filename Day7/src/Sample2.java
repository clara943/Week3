public class Sample2 {

	public static void main(String[] args) {
		try {
			int[] a = { 1, 2, 3 };
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("배열 제대로 확인해~!");
		}
	}
}