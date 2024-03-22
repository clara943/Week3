
public class MyQueue2 extends Memory2 {

	private int front = 0;

	@Override
	public int pop() {
		return arr[front++];

	}

}
