package march15;

import java.util.Stack;

public class stack1 {
public static void main(String[] args) {
	Stack stack = new Stack();
	stack.push("A");
	stack.push("B");
	stack.push("C");
	stack.push("D");
	
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.search("C"));
//	peak,search,pop,push,
}
}
