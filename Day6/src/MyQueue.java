
public class MyQueue extends Memory {

	private int front = 0;

	@Override
	public int pop() {
		return arr[front++];

	}

}
