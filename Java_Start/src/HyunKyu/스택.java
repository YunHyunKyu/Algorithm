package HyunKyu;

import java.util.Stack;

public class ���� {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1); // stack�� �ֱ�
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.pop();   // stack���� ������
		
		System.out.println(stack.peek());
		
		stack.contains(5); // stack�� 5�� ����ִٸ� true
		if(stack.contains(4) == true)
			System.out.println(stack);
		
		

	}

}
