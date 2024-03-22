
import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
	
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int b = sc.nextInt();
		

	if (a>b) {
		System.out.println(a +"가 " + b+"보다 크다");
	}
	
	else if (a<b) {
		System.out.println(b +"가 " + a+"보다 크다");
	}
	
	else {
		System.out.println(a +"와 " + b+"가 같다");
	
	}
}
}