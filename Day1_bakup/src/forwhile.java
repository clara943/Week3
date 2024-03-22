/*
 * 반복문
 * : 조건
 * 
 * for문
 * for(초기문; 조건문; 증감문;){
 * 
 * .....
 * }
 * while문
 * 
 * do~while문: 무조건 한 번은 수행하고, 다음에 체크
 * 
 * foreach문: 배열을 사용할 때 사용
 */


public class forwhile {

	public static void main(String []args) {
		
		int rect = 1;
		int count = 0;
		
		for(count =0; rect<500; count++) {
			rect *= 2;
		}
				System.out.println(count);
				System.out.println(rect);
				}
	{
	int rect = 1;
	int count = 0;
	
	while(rect<500) {
		System.out.println(count);
		System.out.println(rect);
		count++;
	}
}
}
