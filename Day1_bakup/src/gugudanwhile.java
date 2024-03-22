
public class gugudanwhile {

	public static void main(String []args) {
		
	
		int i=1; 
		while(i<=9) {
			int j=2;
			while(j<=9) {
				System.out.print(j + "x" + i + "=" + (j*i) + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
