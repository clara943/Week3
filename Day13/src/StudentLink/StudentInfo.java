package StudentLink;

public class StudentInfo {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	StudentInfo next;

	public StudentInfo(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return this.getMat() + this.getEng() + this.getKor();
	}

	public float getAvg() {
		return (this.getMat() + this.getEng() + this.getKor()) / (float) 3;
	}

	public void show() {
		System.out.println("이름: " + getName());
		System.out.print("국어: " + getKor() + "점 ");
		System.out.print("수학: " + getMat() + "점 ");
		System.out.println("영어: " + getEng() + "점 ");
		System.out.print("총합: " + getTotal() + "점 ");
		System.out.println("평균: " + getAvg() + "점 ");
		System.out.println("===================================");
	}

}
