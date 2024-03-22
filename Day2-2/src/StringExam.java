
public class StringExam {

	public static void main(String[] args) {

		String str1 = new String("Superman");
		String str2 = new String("Superman");
		//str1과 str2는 각각 새로운 문자열 객체를 생성합니다. "Superman" 문자열을 저장하는 새로운 객체가 각각 생성됩니다. 이는 new String()을 사용하여 강제로 새로운 객체를 만든 것입니다.
		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (str1.equals(str2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");

		}
		String str3 = "Batman";
		String str4 = "Batman";
		//str3은 문자열 리터럴을 사용하여 생성되었습니다. Java에서는 문자열 리터럴을 만날 때마다, 같은 리터럴을 가리키는 새로운 문자열 객체를 만들지 않고, 이미 있는 경우 기존 객체를 재사용합니다. 

		System.out.println(str3);
		System.out.println(str4);

		if (str3 == str4) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (str3.equals(str4)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		str4 = "pororo";
		if (str3 == str4) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		if (str3.equals(str4)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}
}
