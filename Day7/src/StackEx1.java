import java.util.*;

import static java.lang.System.out;

public class StackEx1 {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		Stack<String> stack = new Stack<String>();
		for(String n : groupA)
			stack.push(n);
		
		while(!stack.isEmpty())
			out.println(stack.pop());

	}

}
