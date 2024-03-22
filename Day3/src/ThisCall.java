
public class ThisCall {

	int a;
	int b;
	//생성자함수 만들기
	public ThisCall() {
		//this.a = 0;
		//this.b = 0;
		this(0,0);
	}
	
	public ThisCall(int a) {
		//this.a = a;
		//this.b = 0;
		this(a,0);
	}
	public ThisCall(int a, int b) {
		this.a = a;
		this.b = b;
	}	
	//생성자함수 끝
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
	public static void main(String[] args) {
		ThisCall th = new ThisCall();
		ThisCall th2 = new ThisCall(10);
		ThisCall th3 = new ThisCall(20,30);
	
	
	System.out.println(th.getA()+","+th.getB());
	System.out.println(th2.getA()+","+th2.getB());
	System.out.println(th3.getA()+","+th3.getB());
	
}
}