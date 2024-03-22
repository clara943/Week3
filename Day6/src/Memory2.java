public abstract class Memory2 {

	protected int index = 0;

	int arr[] = new int[5];

	public void push(int i) {
		arr[index++] = i;
		System.out.println("입력값: " + i);

	}

	public abstract int pop();
}
