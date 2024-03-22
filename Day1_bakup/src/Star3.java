
public class Star3 {
	public static void main(String []args) {

		for(int i=1;i<=3;i++) {
			for(int j=3;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
