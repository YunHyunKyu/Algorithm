package HyunKyu;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(1); // 추가
		que.add(2);
		que.offer(3); // 추가
		
		que.poll(); // Queue의 첫번째 값을 반환하고 제거, 비어있으면 null 반환
		que.remove(); // Queue의 첫번째 값 제거
		que.clear(); // Queue 초기화
		
		que.offer(4); // 추가
		que.peek(); // 첫번째 값 참조
		
		System.out.println(que);
	}

}
