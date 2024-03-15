package Day7;

import java.util.* ;
import static java.lang.System.out;

public class StackExam1 {
	public static void main(String[] args) {
		 
		String groupA[] = {"사우디","한국","쿠웨이트","우즈벡"} ;
		
		Stack<String> stack = new Stack<String>();
		for(String n : groupA)
			stack.push(n);
		
		while(!stack.isEmpty())
			out.println(stack.pop());
	}
}
