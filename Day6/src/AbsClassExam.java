abstract class Area { // 추상클래스에도 abstract 명시해야함

	public abstract void draw(); // 추상메소드는 abstract 사용
}

class Rect extends Area {

	@Override
	public void draw() {
		System.out.println("Rect");

	}

}

class Circle extends Area {

	@Override
	public void draw() {
		System.out.println("Circle");

	}

}

class Tri extends Area {

	@Override
	public void draw() {
		System.out.println("Tri");

	}

}

public class AbsClassExam {
	
	public static void main(String[] args) {
		Tri tri = new Tri();
		tri.draw();
		
		Rect rect = new Rect();
		rect.draw();
		
		Circle cir = new Circle();
		cir.draw();
	}

}
