public abstract class Memory {

	protected int index = 0;

	int arr[] = new int[5];

	public void push(int i) {
		arr[index++] = i;
		System.out.println("입력값: " + i);

	}

	public abstract int pop();

//	public int getIndex() {
//		return index;
//	}
//
//	public void setIndex(int index) {
//		this.index = index;
//	}

}
