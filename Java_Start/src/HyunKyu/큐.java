package HyunKyu;

import java.util.LinkedList;
import java.util.Queue;

public class ť {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(1); // �߰�
		que.add(2);
		que.offer(3); // �߰�
		
		que.poll(); // Queue�� ù��° ���� ��ȯ�ϰ� ����, ��������� null ��ȯ
		que.remove(); // Queue�� ù��° �� ����
		que.clear(); // Queue �ʱ�ȭ
		
		que.offer(4); // �߰�
		que.peek(); // ù��° �� ����
		
		System.out.println(que);
	}

}
