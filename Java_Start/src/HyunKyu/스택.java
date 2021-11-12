package HyunKyu;

import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1); // stack에 넣기
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.pop();   // stack에서 꺼내기
		
		System.out.println(stack.peek());
		
		stack.contains(5); // stack에 5가 들어있다면 true
		if(stack.contains(4) == true)
			System.out.println(stack);
		
		

	}

}
